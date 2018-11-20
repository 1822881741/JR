package cn.jiafeng.erp.data.adapter.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiafeng.erp.data.adapter.dao.ImportsheetItemMapper;
import cn.jiafeng.erp.data.adapter.dao.ImportsheetMapper;
import cn.jiafeng.erp.data.adapter.dao.entity.Importsheet;
import cn.jiafeng.erp.data.adapter.dao.entity.ImportsheetItem;
import cn.jiafeng.erp.data.adapter.extend.exception.ServiceVerify;
import cn.jiafeng.erp.data.adapter.model.dto.AddResult;
import cn.jiafeng.erp.data.adapter.model.dto.BaseParamters;
import cn.jiafeng.erp.data.adapter.model.dto.ImportsheetDto;
import cn.jiafeng.erp.data.adapter.service.ImportsheetService;
import cn.jiafeng.erp.data.adapter.util.DateUtils;
import cn.jiafeng.erp.data.adapter.util.MapperUtil;

/**
 * 入库单 Service实现
 * 
 * @author
 * @date 2018-11-12
 */
@Service
@Transactional
public class ImportsheetServiceImpl implements ImportsheetService {

	/**
	 * 入库单 Dao
	 */
	@Autowired
	private ImportsheetMapper importsheetDao;

	@Autowired
	private ImportsheetItemMapper importsheetItemDao;

	@Override
	@Transactional(readOnly = true)
	public Importsheet getImportsheetById(Integer id) {
		return importsheetDao.getById(id);
	}

	@Override
	@Transactional
	public List<AddResult> insertImportsheet(ImportsheetDto models) throws Exception {

		int number = 1 + importsheetDao.getSheetNumber(models.getCompanyNo());

		ServiceVerify.Verify(models == null || models.getItems() == null || models.getItems().size() < 1,
				"入库单或入库单明细不能为空");

		String temp="00000".concat(String.valueOf(number));
		temp.substring(temp.length() - 5, temp.length());
		String sheetNo = "J".concat(DateUtils.getNowDateStr()).concat(temp);

		// 处理入库单表头
		Importsheet header = MapperUtil.MapperTo(models, Importsheet.class);
		header.setSheetNo(sheetNo);
		header.setOldSheetNo(sheetNo);
		importsheetDao.insert(header);

		List<ImportsheetItem> details = MapperUtil.MapperToArray(models.getItems(), ImportsheetItem.class);
		details.stream().forEach(s -> {
			setDetailHeader(header, s);
			s.setSheetNo(sheetNo);
			s.setOldSheetNo(sheetNo);
		});

		// 处理入库明细
		importsheetItemDao.insertBatch(details);
		return MapperUtil.MapperToArray(details, AddResult.class);
	}

	private void setDetailHeader(Importsheet header, ImportsheetItem detail) {
		detail.setSheetId(header.getId());
		detail.setSheetNo(header.getSheetNo());
		detail.setOldSheetNo(header.getOldSheetNo());
		detail.setSupplierNo(header.getSupplierNo());
		detail.setSupplierName(header.getSupplierName());
		detail.setSheetDate(new Date());
	}

	@Override
	public int updatePartImportsheet(Importsheet importsheet) throws Exception {
		return importsheetDao.updatePart(importsheet);
	}

	@Override
	public int deleteImportsheet(Integer id) {
		return importsheetDao.deleteByPk(id);
	}

	@Override
	@Transactional
	public void delByIds(BaseParamters param) throws Exception {
		ServiceVerify.Verify(param == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getCompanyNo() == null, "企业编号不能为空");
		ServiceVerify.Verify(param.getIds() == null || param.getIds().size() < 1, "id不能为空");
		importsheetDao.delByIds(param);
		importsheetItemDao.delBySheetIds(param);
	}
}
