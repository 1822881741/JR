package cn.jiafeng.erp.data.adapter.service;

import java.util.List;

import cn.jiafeng.erp.data.adapter.dao.entity.GoodsArchives;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.GoodsArchivesDto;

/**
 * 商品档案表 Service
 * 
 * @author
 * @date 2018-11-12
 */
public interface GoodsArchivesService {

	/**
	 * 根据id查询商品档案表
	 * 
	 * @param id
	 *            id
	 * @return 商品档案表
	 */
	GoodsArchives getGoodsArchivesById(Integer id);

	/**
	 * 保存商品档案表
	 * 
	 * @param goodsArchives
	 *            商品档案表
	 * @return 操作影响行数
	 */
	int[] insertGoodsArchives(List<GoodsArchivesDto> goodsArchives) throws Exception;

	/**
	 * 局部更新商品档案表
	 * 
	 * @param goodsArchives
	 *            商品档案表
	 * @return 操作影响行数
	 */
	int updatePartGoodsArchives(GoodsArchives goodsArchives) throws Exception;

	/**
	 * @param companyNo 企业编号
	 * @param remarks 备注
	 */
	void delByCompanyNoAndRemarks(String companyNo, String remarks) throws Exception;

	void delByIds(BaseParamters param) throws Exception;
}
