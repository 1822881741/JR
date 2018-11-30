function validateForm(formElement){
	var valResult =true;
	$("#"+formElement).find("input,select").each(function(){
		if($(this).data("validate") == 'required'){
			if($(this).val()==null || $(this).val()==undefined || $(this).val() ==''){
				layer.tips('该属性不能为空', '#'+$(this).attr("id"),{tips: [2,'black']});
				valResult=false;
				return false
			}
		}
	})
	return valResult;
}
