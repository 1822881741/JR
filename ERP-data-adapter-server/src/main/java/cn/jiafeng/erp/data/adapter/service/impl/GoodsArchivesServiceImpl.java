package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.service.GoodsArchivesService;
import cn.jiafeng.erp.data.adapter.util.MapperUtil;
import cn.jiafeng.erp.data.adapter.dao.GoodsArchivesMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.GoodsArchives;
import cn.jiafeng.erp.data.adapter.extend.exception.ServiceVerify;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.GoodsArchivesDto;

/**
 * 商品档案表 Service实现
 * 
 * @author
 * @date 2018-11-12
 */
@Service
@Transactional
public class GoodsArchivesServiceImpl implements GoodsArchivesService {

	/**
	 * 商品档案表 Dao
	 */
	@Autowired
	private GoodsArchivesMapper goodsArchivesDao;

	@Override
	@Transactional(readOnly = true)
	public GoodsArchives getGoodsArchivesById(Integer id) {
		return goodsArchivesDao.getById(id);
	}

	@Override
	public int[] insertGoodsArchives(List<GoodsArchivesDto> goodsArchives) throws Exception {
		ServiceVerify.Verify(goodsArchives == null || goodsArchives.size() < 1, "商品档案不能为空");
		List<GoodsArchives> newlist = new ArrayList<>();
		for (GoodsArchivesDto goodsArchivesDto : goodsArchives) {
			GoodsArchives temp = MapperUtil.MapperTo(goodsArchivesDto, GoodsArchives.class);
			temp.setStatus(false);
			newlist.add(temp);
		}
		goodsArchivesDao.insertBatch(newlist);
		return newlist.stream().mapToInt(s -> s.getId()).toArray();
	}

	@Override
	public int updatePartGoodsArchives(GoodsArchives goodsArchives) throws Exception {
		return goodsArchivesDao.updatePart(goodsArchives);
	}

	@Override
	public void delByCompanyNoAndRemarks(String companyNo, String remarks) throws Exception {
		ServiceVerify.Verify(companyNo.equalsIgnoreCase(""), "企业编号不能为空");
		ServiceVerify.Verify(remarks.equalsIgnoreCase(""), "备注不能为空");
		goodsArchivesDao.delByCompanyNoAndRemarks(companyNo, remarks);
	}

	@Override
	@Transactional
	public void delByIds(BaseParamters param) throws Exception {
		ServiceVerify.Verify(param == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getCompanyNo() == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getIds() == null || param.getIds().size() < 1, "id不能为空");
		goodsArchivesDao.delByIds(param);
	}
}
