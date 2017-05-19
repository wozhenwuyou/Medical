var FLAG_ADD_DRUG = [];
if(!lh.param)lh.param = {};
$(function(){
	initData();
});
$(document).on('click','a[name="removeDrug"]',function(){
	var idDate = $(this).attr('val');
	idDate = JSON.parse(idDate);
	for(var i=0; i<FLAG_ADD_DRUG.length; i++){
		var medical = FLAG_ADD_DRUG[i];
		if(medical.medicalTypeId == idDate.medicalTypeId && medical.medicalId == idDate.medicalId){
			FLAG_ADD_DRUG.splice(i, i+1);
			console.log(FLAG_ADD_DRUG)
			break;
		}
	}
});
function initData(){
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	$('#tagName').bind('input propertychange focus', function() {
		$('#tagName').on('blur', function(){$('#phraseDiv').slideUp(600)});
		searchPhrase();
	});
	$("#phraseUl").click(function(e){
		completeTagName(e.target.innerText);
	});
}

function searchPhrase(){
	var tagName = $('#tagName').val();
	if(!tagName)return;
	lh.post('front','/getPhraseRecordArray',{name:tagName},function(rsp){
		if(!rsp)return;
		var rows = rsp;
		if(!rows || rows.length<=0)return;
		var dom = '';
		for(i in rows){
			var obj = rows[i];
			dom += '<li>'+obj.name+'</li>';
		}
		$('#phraseUl').html(dom);
		$('#phraseDiv').slideDown(300);
	});
}

function completeTagName(name){
	$('#tagName').val(name);
}

/** 更新病历 */
function getBaseDiagnoseFromDom(){
	var allergyHistory = $('#allergyHistory').val();
	var baseCondition = $('#baseCondition').val();
	
	var tagItems = $('#tagsContainer .tagsItem');
	var presItems = $('#prescriptionContainer .presItem');
	
	var preList = [];
	for(var i=0; i<presItems.length; i++){
		var presItem = presItems[i];
		var medicalType = $(presItem).find('.medicalType').text();
		var medicalName = $(presItem).find('.medicalName').text();
		var medicalNum = $(presItem).find('.medicalNum').text();
		var medicalId = $(presItem).find('.medicalId').text();
		var medicalTypeId = $(presItem).find('.medicalTypeId').text();
		var medicalPrice = $(presItem).find('.medicalPrice').text();
		
		var preObj = {id:medicalId,medicationId:medicalId,medicalType:medicalType,medicalName:medicalName,medicalNum:medicalNum,medicalTypeId:medicalTypeId, medicalPrice:medicalPrice};
		preList.push(preObj);
	}
	var tagNameList = [];
	for(var j=0; j<tagItems.length; j++){
		var tagName = tagItems[j];
		var name = $(tagName).find('.tagName').text();
		var tagObj = {tagName:name};
		tagNameList.push(tagObj);
	}
	preList = JSON.stringify(preList);
	tagNameList = JSON.stringify(tagNameList);
	var obj = {allergyHistory:allergyHistory,baseCondition:baseCondition,prescription:preList,diagnoseTags:tagNameList};
	return obj;
}

function addPrescription(medicalId, medicalTypeId, medicalType, medicalName, medicalNum){
	if(!medicalType)medicalType = $('#mtSelect').find("option:selected").text(); 
	//if(!medicalName)medicalName = $('#mSelect').find("option:selected").text(); 
	if(!medicalName)medicalName = $('#mSelect').combobox('getText'); 
	
	/*var mtSelectId = $('#mtSelect').find("option:selected").val(); //类型
	var mSelectId = $('#mSelect').find("option:selected").val(); //药品
	 */	
	//var medicalPrice = $('#mSelect').find("option:selected").attr('price'); //价格
	//if(!medicalId)medicalId = $('#mSelect').val(); 
	if(!medicalId)medicalId = $('#mSelect').combobox('getValue');
	if(!medicalTypeId)medicalTypeId = $('#mtSelect').val(); 
	if(!medicalNum)medicalNum = $('#medicalNum').val();
	
	if(!medicalType){
		lh.alert('请选择药品类型');return;
	}
	if(!medicalName){
		lh.alert('请选择药品');return;
	}
	if(!medicalNum){
		lh.alert('请选择药品数量');return;
	}
//	alert(mtSelectId+'=药品='+mSelectId)
	lh.post('front', '/selectMedicationRemainingAndPrice', {medicationId:medicalId, medicationNumber:medicalNum}, function(rsp){
		if(!rsp.success){
			lh.alert(rsp.msg);return;
		}
		if(rsp.remainNum >= 0 ){
			var medicalPrice = rsp.medicalPrice;
			var flag = true;
			for(var i=0; i<FLAG_ADD_DRUG.length; i++){
				var drug = FLAG_ADD_DRUG[i];
				if(drug.medicalTypeId == medicalTypeId && drug.medicalId == medicalId){
					flag = false;
					break;
				}
			}
			if(flag){
				var addData = {medicalTypeId:medicalTypeId, medicalId:medicalId};
				var data = {medicalId:medicalId,medicalType:medicalType,medicalTypeId:medicalTypeId, medicalName:medicalName, medicalNum:medicalNum, medicalPrice:medicalPrice, idData:JSON.stringify(addData)};
				var dom = buildDom(data);
				$('#prescriptionContainer').append(dom);
				refreshTotalPrice();//刷新总价格
				FLAG_ADD_DRUG.push(addData);
			}else{
				lh.alert('相同类型药品不能重复添加');
			}
		}else{
			lh.alert(medicalName+'库存数量不足');
		}
	})
}

function refreshTotalPrice(){
	var obj = getBaseDiagnoseFromDom();
	var prescription = obj.prescription;
	prescription = JSON.parse(prescription);
	var price = 0;
	for(var i in prescription){
		var pre = prescription[i];
		var medicalNum = pre.medicalNum;
		var medicalPrice = pre.medicalPrice;
		if(!medicalNum)medicalNum = 0;
		medicalNum = new Number(medicalNum);
		if(!medicalPrice)medicalPrice = 0;
		medicalPrice = new Number(medicalPrice);
		itemTotalprice = medicalNum * medicalPrice;
		price += itemTotalprice;
	}
	if(price < 0 ){
		lh.alert('药品价格不能小于零');
	}
	$('#totalPrice').val(price);
}

function buildDom(data){
	var template = $('#template').html();
	Mustache.parse(template);
	data.serial = lh.createSerial();
	var rendered = Mustache.render(template, data);
	return rendered;
}

function addTag(tagName){
	if(!tagName){
		tagName = $('#tagName').val();
	}
	if(!tagName){
		lh.alert('请输入诊断结果');return;
	}
	var serial = lh.createSerial();
	var dom = '<span id="tagItem_'+serial+'" class="tagsItem"><span class="tagName">'+tagName+'</span><a href="javascript:" onclick="removeTag(\''+serial+'\');" class="pf_6"><img src="/images/front/er2.png" width="6" height="6"/></a></span>';
	$('#tagsContainer').append(dom);
	$('#tagName').val(null);
	
}

function removePrescription(serial, medicalId){
	$('#presItem_'+serial).remove();
	var index = 0;
	for(var i=0; i<FLAG_ADD_DRUG.length; i++){
		var drug = FLAG_ADD_DRUG[i];
		if(drug.medicalId == medicalId){
			index = i;break;
		}
	}
	if(index){
		FLAG_ADD_DRUG.splice(index, 1);
	}
	refreshTotalPrice();
}

function removeTag(serial){
	$('#tagItem_'+serial).remove();
}

function loadMedicationList(){
	lh.param.medicationAry = [];
	var medicalType = $('#mtSelect').val();
	lh.post('front', '/getMedicationRepertoryAry', {medicationTypeId:medicalType}, function(rsp){
		if(rsp.success){
			var rows = rsp.rows;
			lh.param.medicationAry = rows;
			var dom = '';
			var data = [];
			for(i in rows){
				var obj = rows[i];
				var item = {id:obj.medicationId, name:obj.medicationName};
				data.push(item);
				//dom += '<option value="'+obj.medicationId+'" price="'+obj.price+'">'+obj.medicationName+'</option>';
			}
			//price
			//remainNum
			//$('#mSelect').html(dom);
			$('#mSelect').combobox({
				valueField : 'id',
				textField : 'name',
				editable : true,
				multiple : false,
			    required : false,
			    height:30,
			    panelHeight : 'auto',
				data : data,
				onChange:function(newValue,oldValue){
					$('#medicationRemark').text('');
					if(newValue){
						var row = _.find(lh.param.medicationAry, ['medicationId', newValue]);
						var dom = '规格：' + (row.specifications || '暂无') + '。 厂商：' + (row.producer || '暂无') + '。<br/>备注：'+(row.remark || '暂无。 ');
						if(row)$('#medicationRemark').html(dom);
					}
				}
			});
		}else{
			lh.alert(rsp.msg);
		}
	});
	
}

function openToScanRecord(){//phone, 
	//patientIdcardNum = '111';
	window.open('/diagnoseForApplyList?patientIdcardNum='+lh.data.patientIdcardNum);
}

function alertGetTemplateName(){
	$('#diagnoseTemplateTitle').modal('show');// data-toggle="modal" data-target="#diagnoseTemplateTitle" data-whatever="@mdo" 
}

/** 从病历中保存为病历模板 */
function addSaveDiagnoseTemplate(){
	//if(!diagnoseTemplateId)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	var templateName = $('#templateName').val();
	if(!templateName){
		lh.alert('请输入模板名称');return;
	}
	var obj = getBaseDiagnoseFromDom();
	obj.templateName = templateName;
	lh.post('front', '/addDiagnoseTemplate', obj,function(rsp){
		if(rsp.success){
			lh.hideAlert();
			lh.alert('您已经成功保存为新模板');return;
			//lh.back();
		}else{
			lh.alert(rsp.msg);
		}
	});
}
