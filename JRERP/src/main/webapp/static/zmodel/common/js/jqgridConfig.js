// jqgrid的通用配置

function getJqgridCategory(type,tableDom,pagerDom) {
	return config = {
		url : 'sysGoodsCategory/getGoodsCategoryData.do?firstType='+type,
		datatype : "json",
		colNames : [ '操作', '系统编码', '助记码', '商品名称', '商品小类', '销售方式', '兑换', '金料', '石料', '品名', '统计大类', '统计中类', '统计小类', '标签模板', '状态' ],
		colModel : [ {
			name : 'opera',
			sortable : false
		}, {
			name : 'systemCode'
		}, {
			name : 'assistCode'
		}, {
			name : 'goodsName'
		}, {
			name : 'secondTypeName'
		}, {
			name : 'saleType',
			formatter : function(cellValue, options, rowObject) {
				if (cellValue == 1) {
					return "折扣";
				} else if (cellValue == 2) {
					return "金价";
				} else if (cellValue == 3) {
					return "折扣+金价";
				} else {
					return "未知";
				}
			}
		}, {
			name : 'canBarter',
			formatter : function(cellValue, options, rowObject) {
				if (cellValue == 1) {
					return "<span style='color:green'>可兑换</span>";
				} else {
					return "<span style='color:red'>不可兑换</span>";
				}
			}
		}, {
			name : 'goldName'
		}, {
			name : 'jewelName'
		}, {
			name : 'categoryName'
		}, {
			name : 'firstClassify'
		}, {
			name : 'secondClassify'
		}, {
			name : 'thirdClassify'
		}, {
			name : 'grfName'
		}, {
			name : 'status',
			formatter : function(cellValue, options, rowObject) {
				if (cellValue == 1) {
					return "<span style='color:green'>在用</span>";
				} else {
					return "<span style='color:red'>禁用</span>";
				}
			}
		} ],
		caption : "商品分类详情",
		rowNum : -1,
		gridComplete : function() {
			var ids = jQuery("#"+tableDom).jqGrid('getDataIDs');
			for (var i = 0; i < ids.length; i++) {
				var cl = ids[i];
				be = "<button class='btn btn-xs btn-default' data-original-title='Edit Row' onclick=\"editCategory('"
						+ cl + "');\"><i class='fa fa-pencil'></i></button>";
				ca = "<button class='btn btn-xs btn-default' data-original-title='Cancel' onclick=\"deleteCategory('"
						+ cl + "');\"><i class='fa fa-times'></i></button>";
				jQuery("#jqgrid").jqGrid('setRowData', ids[i], {
					opera : be + ca
				});
			}
		},
		multiselect : true,
		pager : '#'+pagerDom,
		viewrecords : true,
		loadonce : true,
		autowidth : true,
		pgbuttons : false,
		pgtext : false,
		rownumbers : false,
		ondblClickRow : function(rowid) { // 双击行
			editCategory(rowid);
		},
		recordtext : "共{1}记录"
	}
}