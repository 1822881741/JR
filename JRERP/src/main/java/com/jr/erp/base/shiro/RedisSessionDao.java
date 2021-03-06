package com.jr.erp.base.shiro;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

public class RedisSessionDao extends EnterpriseCacheSessionDAO {

	private RedisTemplate redisTemplate;
	 
    Logger log= LoggerFactory.getLogger(getClass());
    /**
     * The Redis key prefix for the sessions
     */
    private String keyPrefix = "shiro_redis_session_manager:";
    private String getKey(String originalKey) {
        return keyPrefix+originalKey;
    }
    @SuppressWarnings("unchecked")
	@Override
    public void doUpdate(Session session) throws UnknownSessionException {
        log.info("更新seesion,id=[{}]",session.getId().toString());
        try {
            redisTemplate.opsForValue().set(getKey(session.getId().toString()), session,30, TimeUnit.MINUTES);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
    }
    @Override
    public void doDelete(Session session) {
        log.info("删除seesion,id=[{}]",session.getId().toString());
        try {
            String key=getKey(session.getId().toString());
            redisTemplate.delete(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    @Override
    public Collection<Session> getActiveSessions() {
        log.info("获取存活的session");
        return Collections.emptySet();
    }
 
    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionId = generateSessionId(session);
        assignSessionId(session, sessionId);
        log.info("创建seesion,id=[{}]",session.getId().toString());
        try {
            redisTemplate.opsForValue().set(getKey(session.getId().toString()), session,30,TimeUnit.MINUTES);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        return sessionId;
    }
 
    @Override
    protected Session doReadSession(Serializable sessionId) {
        log.info("获取seesion,id=[{}]",sessionId.toString());
        Session session = null;
        try {
//        	String sessionStr =(String) redisTemplate.opsForValue().get(getKey(sessionId.toString()));
//        	System.out.println(sessionStr.toString());
            session=(Session) redisTemplate.opsForValue().get(getKey(sessionId.toString()));
//            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        return session;
    }
    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }
 
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
