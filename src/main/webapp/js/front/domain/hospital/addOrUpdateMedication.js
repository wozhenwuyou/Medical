$(function(){
	highLightLeftMenu('lm_medication');
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	
	lh.post("front", "/hospital/getMedicationTypeArray", function(rsp){
		var optionHtml = '<option>请选择</option>';
		if(rsp.length>0){
			for(var i=0;i<rsp.length;i++){
				optionHtml+='<option value="'+rsp[i].id+'">'+rsp[i].name+'</option>';
			}
		}
		$('#f_medicationTypeId').html(optionHtml);
		if(typeId){
			$('#f_medicationTypeId').val(typeId);
		}
		if(mainStatus){
			$('#f_mainStatus').val(mainStatus);
		}
		
	});
});

$(document).on('change','#f_medicationTypeId',function(){
	var typeId = $(this).val();
	lh.post("front", "/hospital/loadMedicationComboboxByTypeId",{typeId:typeId}, function(rsp){
		//var optionHtml = '<option>请选择</option>';
		var data = [];
		if(rsp.medicationList && rsp.medicationList.length>0){
			for(var i=0;i<rsp.medicationList.length;i++){
				var obj = rsp.medicationList[i];
				//optionHtml+='<option value="'+obj.id+'">'+obj.name+'</option>';
				var item = {id:obj.id, name:obj.name};
				data.push(item);
			}
		}
		//$('#f_medicationId').html(optionHtml);
		
		$('#f_medicationId').combobox({
			valueField : 'id',
			textField : 'name',
			editable : true,
			multiple : false,
		    required : false,
		    height:30,
		    panelHeight : 'auto',
			data : data,
			onChange:function(newValue,oldValue){
				loadMedicationInfo(newValue);
			}
		});
		
	});
});

/*$(document).on('change','#f_medicationId',function(){
	var id = $(this).val();
	loadMedicationInfo(id);
});*/

function loadMedicationInfo(id){
	lh.post("front", "/hospital/loadAttentionAndUsageAndDosage",{id:id}, function(rsp){
		var medication = rsp.medication;
		var mr = rsp.mr;
		if(medication){
			$("#usageAndDosage").text(medication.usageAndDosage || '暂无');
			$("#attention").text(medication.attention || '暂无');
			$("#unit").val(medication.unit || '');
			if(mr){//已经有库存
				$("#medicationRepertoryId").val(mr.id);
				$("#remainNum").val(mr.remainNum);//库存数量
				$("#warningNum").val(mr.warningNum);//预警数量
				$("#price").val(mr.price);//价格
				$("#f_mainStatus").val(mr.mainStatus);//是否开启 1 开启 2 停用
				$("#remark").val(mr.remark);//备注
			}else{
				$("#medicationRepertoryId").val(null);
				$("#remainNum").val(null);//库存数量
				$("#warningNum").val(null);//预警数量
				$("#price").val(null);//价格
				$("#f_mainStatus").val(1);//是否开启 1 开启 2 停用
				$("#remark").val(null);//备注
			}
		}else{
			$("#usageAndDosage").text('暂无');
			$("#attention").text('暂无');
		}
	});
}

function addOrUpdateMedication(){
	if(lh.preventRepeat()){//防止重复提交
//		saveData();
		saveDataNew();
	}else{
		//lh.showRepeatTip();//提示重复提交
		lh.alert('请不要重复提交数据');
	}
}

/*function saveData(){
	var medicationId = $("#medicationId").val();
	var warningNum = $("#warningNum").val();
	var remainNum = $("#remainNum").val();
	var englishName = $("#englishName").val();
	var name = $("#name").val();
	var producer = $("#producer").val();
	var produceAddress = $("#produceAddress").val();
	var producerTel = $("#producerTel").val();
	var producerCode = $("#producerCode").val();
	if(!name){lh.alert('请填写药品名称');return;}
	if(!englishName){lh.alert('请填写药品英文名称');return;}
	if(!warningNum){lh.alert('请填写告警数量');return;}
	if(!remainNum){lh.alert('请填写库存数量');return;}
	if(!producer){lh.alert('请填写生产商');return;}
	if(!producerTel){lh.alert('请填写生产商电话');return;}
	if(!producerCode){lh.alert('请填写生产商邮编');return;}
	if(!produceAddress){lh.alert('请填写生产地址');return;}
	var obj = {id:medicationId,name:name,englishName:englishName,warningNum:warningNum,remainNum:remainNum,
			producer:producer,producerTel:producerTel,producerCode:producerCode,produceAddress:produceAddress};
	lh.post("front", "/hospital/addOrUpdateMedicationRepertory", obj, function(rsp){
		if(rsp.status == 'success'){
			lh.jumpToUrl('/hospital/hospitalHome');
		}else{
			lh.alert(rsp.msg);
		}
	}, "json");
}*/

function saveDataNew(){
	var medicationTypeId = $("#f_medicationTypeId").val();//药品类型
	//var medicationId = $("#f_medicationId").val();//药品名称
	var medicationId = $('#f_medicationId').combobox('getValue');
	var remainNum = $("#remainNum").val();//库存数量
	var warningNum = $("#warningNum").val();//预警数量
	var price = $("#price").val();//价格
	var mainStatus = $("#f_mainStatus").val();//是否开启 1 开启 2 停用
	var medicationRepertoryId = $("#medicationRepertoryId").val();
	var remark = $("#remark").val();//备注
	
	var medicationTypeIdFlag = validatorNum('#f_medicationTypeId',/^[0-9]{1,10}$/);
	var medicationIdFlag = validatorNum('#f_medicationId',/^[0-9]{1,10}$/,medicationId);
	
	var remainNumFlag = validatorNum('#remainNum',/^[0-9]{1,10}$/);
	var warningNumFlag = validatorNum('#warningNum',/^[0-9]{1,10}$/);
	var mainStatusFlag = validatorNum('#f_mainStatus',/^[0-9]{1,10}$/);
	
	
	if(!medicationTypeId){lh.alert('请选择药品类型');return;}
	if(!medicationIdFlag){lh.alert('请填写药品名称');return;}
	if(!remainNumFlag){lh.alert('请填写正确库存数量');return;}
	if(!warningNumFlag){lh.alert('请填写正确预警数量');return;}
	if(!price || price <= 0){lh.alert('请填写正确药品价格');return;}
	if(!mainStatusFlag){lh.alert('请选择是否开启');return;}
	var obj = {
		id:medicationRepertoryId,
		medicationTypeId:medicationTypeId,
		medicationId:medicationId,
		remainNum:remainNum,
		warningNum:warningNum,
		price:price,
		mainStatus:mainStatus,
		remark:remark
	};
	lh.post("front", "/hospital/addOrUpdateMedicationRepertory", obj, function(rsp){
		if(rsp.status == 'success'){
			lh.jumpToUrl('/hospital/medicationRepertory');
		}else{
			lh.alert(rsp.msg);
		}
	}, "json");
}

//验证整数
var validatorNum  = function(obj,reg,value){
	if(!value){
		value = $(obj).val();
	}
	if(value){
		if(reg.test(value)){  
			return true;
		}else{
			return false;
		}  
	}
}
