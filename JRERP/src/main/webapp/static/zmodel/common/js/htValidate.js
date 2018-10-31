function htValidate(){
	// 商品分类校验校验
	this.categoryValidator =function(value, callback) {
		var selectedCell = hot.getSelected();
		if(selectedCell && (Object.prototype.toString.call(selectedCell) === '[object Array]') && selectedCell.length > 0){
			var selectedRowIndex = selectedCell[0];				
			var selectedId = "";
			for (var index = 0; index < optionsList.length; index++){
				if (parseInt(value) === optionsList[index].id)
				{
					selectedId = optionsList[index].id;
					value = optionsList[index].text;
					hot.setDataAtRowProp(selectedRowIndex,"archivesId",selectedId);
					hot.setDataAtRowProp(selectedRowIndex,"goodsName",value);
					break;
				}
			}
			
		}
		if ($.inArray(value, this.validateArray) < 0) {
			callback(false);
		} else {
			callback(true);
		}
	};
	//整数校验
	this.integerValidator=function(value,callback){
		if ($.isNumeric(value) && parseInt(value) ==parseFloat(value) && parseInt(value) >0) {
			callback(true);
		} else {
			callback(false);
		}
	}
}
