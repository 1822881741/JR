CREATE TABLE `sys_second_type` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `companyNo` varchar(50) DEFAULT NULL COMMENT '公司编号',
  `parentType` varchar(50) DEFAULT NULL COMMENT '所属大类',
  `secondType` varchar(30) DEFAULT NULL COMMENT '分类缩写',
  `secondTypeName` varchar(50) DEFAULT NULL COMMENT '名称',
  `saleType` tinyint(3) DEFAULT NULL COMMENT '销售方式 1：按折扣 2：按金价 3：按金工石销售',
  `canBarter` tinyint(3) DEFAULT NULL COMMENT '是否可兑换 1：可以，0：不可用',
  `isSystem` tinyint(3) DEFAULT NULL COMMENT '1：是系统默认 0：不是系统默认',
  `status` tinyint(3) DEFAULT NULL COMMENT '1：可用 0：不可用',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品中类';
 