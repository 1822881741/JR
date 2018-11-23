	function checkBillFlow(areaCode,module){
		var result=false;
		$.ajax({
	        type: "POST",
	        url: "param/checkBillFlow.do",
	        dataType: 'json',
	        data:"module="+module+"&areaCode="+areaCode,
	        async: false,
	        success: function(data) {
	            if (data.status == '100') {
	            	result=true;
	            }else{
	            	result=false
	            	var paramList=data.data;
	            	var paramArr=[];
	            	for(var i=0;i<paramList.length;i++){
	            		paramArr.push({view:"checkbox", labelRight:paramList[i].remarks, value:paramList[i].paramValue ,name:paramList[i].paramName})
	            	}
	            	paramArr.push({ view:"button", value: "保存", click:function(){
    					$.ajax({
    				        type: "POST",
    				        url: "param/updateBillFlowParam.do?module="+module+"&areaCode="+$("#areaCode").val(),
    				        dataType: 'json',
    				        async: false,
    				        contentType:"application/json",
    				        data:JSON.stringify(this.getParentView().getValues()),
    				        success: function(data) {
    				            if (data.status == '100') {
    				            	$$('win2').close();
    				            	layer.msg("保存成功，请再次保存")
    				            }else{
    				            	layer.msg("获取柜台失败");
    				            }
    				        },
    				        error: function() {
    				        	layer.alert("连接服务器失败，请稍后重试");
    				        }
    				    });
    				}});
	            	var form=webix.ui({
	                    view:"window",
	                    id:"win2",
	                    width:300,
	                    position:"center",
	                    modal:true,
	                    head:{
	    					view:"toolbar", margin:-4, cols:[
	    						{view:"label", label: "尚未设置进货流程，来设置下吧" },
	    						{ view:"icon", icon:"mdi mdi-close", click: function(){
	    							$$('win2').close();
	    						}}
	    					]
	    				},
	                    body:{
	            			view:"form",
	            			borderless:true,
	            			elements: paramArr,
	            			elementsConfig:{
	            				labelPosition:"top",
	            			}
	            		}
	                });
	            	 $$("win2").getBody().clear();
	            	 form.show();
	                 $$("win2").getBody().focus();
	            }
	        },
	        error: function() {
	        	layer.alert("连接服务器失败，请稍后重试");
	        }
	    });
		return result;
	}