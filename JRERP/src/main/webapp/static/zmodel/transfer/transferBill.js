function getColumn(){
	return [
     {id:"rowNo",header:'#',sort:"int",css:"header",width:50},
     {id:"id",header:'id',hidden:true},
     {id:"barcode",sort:"string",header:"条码"},
     {id:"oldBarcode",sort:"string",header:"原条码"},
     {id:"productName",sort:"string",header:"商品名称"},
     {id:"supplier",sort:"string",header:"供应商名称"},
     {id:"brandName",sort:"string",header:"品牌名称"},
     {id:"subName",sort:"string",header:"商品子名称"},
     {id:"certificateNo",sort:"string",header:"证书号"},
     {id:"giaCertificateNo",sort:"string",header:"GIA证书号"},
     {id:"style",sort:"string",header:"款式"},
     {id:"comStyleNo",sort:"string",header:"公司款号"},
     {id:"facStyleNo",sort:"string",header:"工厂款号"},
     {id:"handInch",sort:"string",header:"手寸"},
     {id:"craft",sort:"string",header:"工艺"},
     {id:"img",sort:"string",header:"图片路径"},
     {id:"remarks",sort:"string",header:"商品备注信息"},
     {id:"bargainName",sort:"string",header:"特价标记"},
     {id:"num",sort:"int",header:"数量",footer:{ content:"summColumn" }},
     {id:"netGoldWeight",sort:"int",header:"净金重",footer:{ content:"summColumn" }},
     {id:"goldLoss",sort:"int",header:"金损"},
     {id:"goldPurity",sort:"int",header:"金成色"},
     {id:"goldWeight",sort:"int",header:"金重",footer:{ content:"summColumn" }},
     {id:"goldPrice",sort:"int",header:"金价"},
     {id:"goldMoney",sort:"int",header:"金料额",footer:{ content:"summColumn" }},
     {id:"productWeight",sort:"int",header:"货重",footer:{ content:"summColumn" }},
     {id:"workFeeKe",sort:"int",header:"克工费"},
     {id:"workFeeJian",sort:"int",header:"件工费"},
     {id:"workFeeSum",sort:"int",header:"总工费",footer:{ content:"summColumn" }},
     {id:"certificateFee",sort:"int",header:"证书费",footer:{ content:"summColumn" }},
     {id:"fittingName",sort:"string",header:"配件名称"},
     {id:"fittingNum",sort:"string",header:"配件数",footer:{ content:"summColumn" }},
     {id:"fittingFee",sort:"int",header:"配件金额",footer:{ content:"summColumn" }},
     {id:"sandBlastFee",sort:"int",header:"喷砂镶石费",footer:{ content:"summColumn" }},
     {id:"otherFee",sort:"int",header:"其他费用",footer:{ content:"summColumn" }},
     {id:"unitPrice",sort:"int",header:"成本单价"},
     {id:"costPrice",sort:"int",header:"成本金额",footer:{ content:"summColumn" }},
     {id:"labelWorkFeeKe",sort:"int",header:"标签克工费"},
     {id:"labelWorkFeeJian",sort:"int",header:"标签件工费"},
     {id:"labelWorkFeeSum",sort:"int",header:"标签工费",footer:{ content:"summColumn" }},
     {id:"labelRate",sort:"int",header:"加价率"},
     {id:"labelPrice",sort:"int",header:"标签价",footer:{ content:"summColumn" }},
     {id:"labelPriceSum",sort:"int",header:"标价金额",footer:{ content:"summColumn" }},
     {id:"labelRemarks",sort:"string",header:"标签备注"},
     {id:"sysCode",sort:"string",header:"商品编码"},
     {id:"goldName",sort:"string",header:"金料名"},
     {id:"jewelName",sort:"string",header:"石头"},
     {id:"categoryName",sort:"string",header:"品名"},
     {id:"firstType",sort:"string",header:"大类名称"},
     {id:"secondType",sort:"string",header:"中类"},
     {id:"productClassify",sort:"string",header:"实际分类"},
     {id:"firstClassify",sort:"string",header:"商品分组"},
     {id:"secondClassify",sort:"string",header:"统计分类2"},
     {id:"labelName",sort:"string",header:"标签显示名称"},
     {id:"grfName",sort:"string",header:"模板名称"},
     {id:"thirdClassify",sort:"string",header:"统计分类3"},
     {id:"mJewelCut",sort:"string",header:"切工"},
     {id:"mJewelColor",sort:"string",header:"颜色"},
     {id:"mJewelClarity",sort:"string",header:"净度"},
     {id:"mJewelFluorescent",sort:"string",header:"荧光"},
     {id:"mJewelBurnished",sort:"string",header:"抛光度"},
     {id:"mJewelShape",sort:"string",header:"形状"},
     {id:"mJewelName",sort:"string",header:"主石名"},
     {id:"mJewelNo",sort:"string",header:"主石石号"},
     {id:"mJewelSpecifi",sort:"string",header:"主石规格"},
     {id:"mJewelNum",sort:"int",header:"主石数",footer:{ content:"summColumn" }},
     {id:"mJewelWeight",sort:"int",header:"主石重",footer:{ content:"summColumn" }},
     {id:"mJewelPrice",sort:"int",header:"主石价"},
     {id:"mJewelFee",sort:"int",header:"主石额",footer:{ content:"summColumn" }},
     {id:"sJewel1Name",sort:"string",header:"副石1名"},
     {id:"sJewel1No",sort:"string",header:"副石1石号"},
     {id:"sJewel1Specifi",sort:"string",header:"副石1规格"},
     {id:"sJewel1Num",sort:"int",header:"副石1数",footer:{ content:"summColumn" }},
     {id:"sJewel1Weight",sort:"int",header:"副石1重",footer:{ content:"summColumn" }},
     {id:"sJewel1Price",sort:"int",header:"副石1价"},
     {id:"sJewel1Fee",sort:"int",header:"副石1额",footer:{ content:"summColumn" }},
     {id:"sJewel2Name",sort:"string",header:"副石2名"},
     {id:"sJewel2No",sort:"string",header:"副石2石号"},
     {id:"sJewel2Specifi",sort:"string",header:"副石2规格"},
     {id:"sJewel2Num",sort:"int",header:"副石2数",footer:{ content:"summColumn" }},
     {id:"sJewel2Weight",sort:"int",header:"副石2重",footer:{ content:"summColumn" }},
     {id:"sJewel2Price",sort:"int",header:"副石2价"},
     {id:"sJewel2Fee",sort:"int",header:"副石2额",footer:{ content:"summColumn" }},
     {id:"sJewel3Name",sort:"string",header:"副石3名"},
     {id:"sJewel3No",sort:"string",header:"副石3石号"},
     {id:"sJewel3Specifi",sort:"string",header:"副石3规格"},
     {id:"sJewel3Num",sort:"int",header:"副石3数",footer:{ content:"summColumn" }},
     {id:"sJewel3Weight",sort:"int",header:"副石3重",footer:{ content:"summColumn" }},
     {id:"sJewel3Price",sort:"int",header:"副石3价"},
     {id:"sJewel3Fee",sort:"int",header:"副石3额",footer:{ content:"summColumn" }},
     {id:"sJewel4Name",sort:"string",header:"副石4名"},
     {id:"sJewel4No",sort:"string",header:"副石4石号"},
     {id:"sJewel4Specifi",sort:"string",header:"副石4规格"},
     {id:"sJewel4Num",sort:"int",header:"副石4数",footer:{ content:"summColumn" }},
     {id:"sJewel4Weight",sort:"int",header:"副石4重",footer:{ content:"summColumn" }},
     {id:"sJewel4Price",sort:"int",header:"副石4价"},
     {id:"sJewel4Fee",sort:"int",header:"副石4额",footer:{ content:"summColumn" }},
     {id:"sJewel5Name",sort:"string",header:"副石5名"},
     {id:"sJewel5No",sort:"string",header:"副石5石号"},
     {id:"sJewel5Specifi",sort:"string",header:"副石5规格"},
     {id:"sJewel5Num",sort:"int",header:"副石5数",footer:{ content:"summColumn" }},
     {id:"sJewel5Weight",sort:"int",header:"副石5重",footer:{ content:"summColumn" }},
     {id:"sJewel5Price",sort:"int",header:"副石5价"},
     {id:"sJewel5Fee",sort:"int",header:"副石5额",footer:{ content:"summColumn" }},
     {id:"priceRange",sort:"string",header:"价格区间"},
     {id:"goldRange",sort:"string",header:"金重区间"},
     {id:"costRange",sort:"string",header:"成本区间"},
     {id:"colorRange",sort:"string",header:"颜色区间"},
     {id:"clarityRange",sort:"string",header:"净度区间"},
     {id:"outNum",sort:"int",header:{text:"出库数",css:{"color":"red"}},footer:{ content:"summColumn" },css:{"color":"red"}},
     {id:"outGoldWeight",sort:"int",header:{text:"出库金重",css:{"color":"red"}},footer:{ content:"summColumn" },css:{"color":"red"}},
     {id:"outMJewelWeight",sort:"int",header:{text:"出库石重",css:{"color":"red"}},footer:{ content:"summColumn" },css:{"color":"red"}},
     {id:"outCostPrice",sort:"int",header:{text:"出库成本",css:{"color":"red"}},footer:{ content:"summColumn" },css:{"color":"red"}},
     {id:"outLabelPriceSum",sort:"int",header:{text:"出库标价金额",css:{"color":"red"}},footer:{ content:"summColumn" },css:{"color":"red"}},
     {id:"outRemarks",sort:"int",header:{text:"出库备注",css:{"color":"red"}},footer:{ content:"summColumn" },css:{"color":"red"}}
	]
}



function addItemByStockId(stockId){
	if(stockId!=null && stockId!=''){
		var data = {};
		var billForm = $("#billForm").serializeArray();
		for(var index=0;index<billForm.length;index++){
			var tmp=billForm[index];
			data[tmp.name]=tmp.value;
		}
		data.areaName= $("#areaCode").find(":selected").html();
		data.counterAreaName= $("#counterAreaCode").find(":selected").html()
		$.ajax({
	        type: "POST",
	        url: "transfer/addItemByStockId.do?stockId="+stockId,
	        dataType: 'json',
	        data: JSON.stringify(data),
			contentType:"application/json",
	        async: false,
	        success: function(data) {
	            if (data.status == '100') {
	            	var itemData = data.data.itemList[0];
	            	var itemId = itemData.id;
	            	$$("itemDatatable").add(itemData);
	            	$("#id").val(itemData.billId);
	            	$$("itemDatatable").select(itemId);
					$$("itemDatatable").showItem(itemId);
					//定位到数量输入框
					$$("form1").getChildViews()[3].focus();
					$$("form1").getChildViews()[3].getInputNode().select();
	            }else{
	            	layer.msg(data.msg);
	            }
	        },
	        error: function() {
	        	layer.alert("连接服务器失败，请稍后重试");
	        }
	    });
	}
}

function showDropdown(obj){
	$(obj).parent().find("label").removeClass("active");
	$(obj).addClass('active');
	$(".notification-body").hide();
	$("#"+$(obj).data("id")).show();
}
function saveBillAudit(){
	if(!validateForm("billForm")){
		return;
	}else{
		if(checkBillFlow($("#areaCode").val(),"transfer")){
			var billInfo = $("#billForm").serialize();
			billInfo+="&areaName="+$("#areaCode").find(":selected").html();
			billInfo+="&counterAreaName="+$("#counterAreaCode").find(":selected").html()
			$.ajax({
		        type: "POST",
		        url: "transfer/saveBillAudit.do",
		        dataType: 'json',
		        data:billInfo,
		        async: false,
		        success: function(data) {
		            if (data.status == '100') {
		            	layer.msg("保存成功！");
		            }else{
		            	layer.msg(data.msg);
		            }
		        },
		        error: function() {
		        	layer.alert("连接服务器失败，请稍后重试");
		        }
		    });
		};
	}
	
}
function reloadData(billInfo){
	if(billInfo){
		$$("itemDatatable").clearAll();
		$$("itemDatatable").parse(billInfo.itemList);
		$("#id").val(billInfo.id);
	}
}
function continueEdit(id){
	window.location.href="transfer/editTransferBill.do?id="+id;
}
function showQueryBuilder(){
	if($("#areaCode").val() =='' || $("#counterAreaCode").val() ==''){
		layer.msg("请先选择调出门店和柜台");
		return;
	}
	var index = layer.open({
		  type: 2,
		  skin: 'layui-layer-rim', //加上边框
		  area: ['720px', '500px'], //宽高
		  fixed: false, //不固定
		  maxmin: true,
		  content : "common/queryBuilder.do?module=transfer",
		  btn : [ '保存', '取消' ],
		  yes : function(index, layero) {
				var result = $(layero).find("iframe")[0].contentWindow.submitData();
				if (result) {
					var param = $("#billForm").serialize();
					param +="&querySql="+result.code;
					$.ajax({
				        type: "POST",
				        url: "transfer/addTransferItemBatch.do",
				        dataType: 'json',
				        data:encodeURI(param),
				        async: false,
				        success: function(data) {
				            if (data.status == '100') {
				            	reloadData(data.data);
				            	layer.close(index);
				            }else{
				            	layer.msg("导入符合条件的内容失败");
				            }
				        },
				        error: function() {
				        	layer.alert("连接服务器失败，请稍后重试");
				        }
				    });
				}
		}
	});
}