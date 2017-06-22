$(function() {
	highLightLeftMenu('lm_phr');
	initPage();
	loadGridData();
});
function initPage() {
	$('.input14').bind('input propertychange', function() {
		$('.input14').on('blur', function() {
			$('.pf_268').slideUp(300)
		});
		$('.pf_268').slideDown(300)
		$('.pf_268 ul li').text(event.target.value)
	});
}

function loadGridData(page, size, count) {
	if (!page)
		page = 1;
	if (!size)
		size = lh.grid.frontSize || 20;
	if (!count)
		count = 1;
	
	var name = $.trim($("#name").val());
	var userNo = $.trim($("#userNo").val());
	var idCardNo = $.trim($("#idCardNo").val());
	var queryScope = $.trim($("#queryScope").val());
	
	lh.post('front', '/phr/doctor/phrList', {
		page : page,
		rows : size,
		name : name,
		userNo : userNo,
		idCardNo : idCardNo,
		queryScope : queryScope
	}, function(rsp) {
		if (rsp.success) {
			var totalNumber = rsp.total || 0;
			$('#dataListContainer').html(buildDom(rsp));
			$('#page').empty().Paging({
				current : page,
				pagesize : size,
				count : totalNumber,
				toolbar : false,
				callback : function(page, size, count) {
					loadGridData(page, size, count);
				}
			});
		} else {
			lh.alert(rsp.msg);
			return;
		}
	});
}

function resetQuery() {
	$("#name").val('');
	$("#idCardNo").val('');
	$("#userNo").val('');
	$("#queryScope").val('2');
	loadGridData();
}

function buildDom(data) {
	var rows = data.rows;
	var sessionDoctorId = data.doctorId;
	var obj = {
		rows : rows,
		fmtCreateTime : function() {
			return this.createTime.toDate().fmt('yyyy-MM-dd');
		}
	}
	var template = $('#template').html();
	Mustache.parse(template);
	var rendered = Mustache.render(template, obj);
	return rendered;
}

/** 申请阅读病历 */
function applyToReadDiagnose(id) {
	if (!id)
		return;
	if (!lh.preventRepeat()) {
		return lh.showRepeatTip();// 提示重复提交
	}
	lh.post('front', '/applyToReadDiagnose', {
		id : id
	}, function(rsp) {
		if (rsp.success) {

		} else {
			lh.alert(rsp.msg);
			return;
		}
	});
}

/** 阅读病历 */
function readDiagnose(id) {
	if (!id)
		return;
	lh.jumpToUrl('/diagnoseRead/' + id);
}

/** 删除病历 */
function deleteDiagnose(id) {
	if (!id)
		return;
	if (!lh.preventRepeat()) {
		return lh.showRepeatTip();// 提示重复提交
	}
	lh.post('front', '/deleteDiagnose', {
		diagnoseId : id
	}, function(rsp) {
		if (rsp.success) {
			loadGridData();
			lh.alert({
				content : '您已经成功删除该病历',
				clickYes : lh.reload
			});
		} else {
			lh.alert(rsp.msg);
		}
	});
}


function deletePhrBasicInfo(id){
	
	if(!id)return;
	if(!lh.preventRepeat()){
		return lh.showRepeatTip();//提示重复提交
	}
	lh.post('front', '/phr/doctor/phrDelete/' + id, {}, function(rsp){
		if(rsp.success){
			loadGridData();
			lh.alert('您已经成功删除该数据');
		}else{
			lh.alert(rsp.msg);
		}
	});
	
}

function fnView(basicInfoId, name){
	var index = layer.open({
		  type: 2,
		  shade: false,
		  scrollbar: false,
		  title: '查看<font color=red>【{0}】</font>的档案信息'.format(name), //不显示标题
		  area : [ '1000px', '680px' ],
		  content: '/views/front/domain/doctor/catalog.jsp?openType=detail&basicInfoId=' + basicInfoId,
		  cancel: function(){
		  }
	});
	layer.full(index);
}

function fnEdit(basicInfoId, name){
	var index = layer.open({
		  type: 2,
		  shade: false,
		  scrollbar: false,
		  btn : [ '保存', '取消' ],
		  title: '编辑<font color=red>【{0}】</font>的档案信息'.format(name), //不显示标题
		  area : [ '1000px', '680px' ],
		  content: '/views/front/domain/doctor/catalog.jsp?openType=edit&basicInfoId=' + basicInfoId, 
		  yes : function() {
			var body = $(window.frames[1].frames[0].document.body);
			var form = body.find("form:first");
			if(form.length > 0){//说明是封面信息或者是健康体检信息
				form.append("<input type='hidden' name='requestFrom' id='requestFrom' value='doctor'>");
				form.append("<input type='hidden' name='phrBasicInfoId' id='phrBasicInfoId' value='"+basicInfoId+"'>");
				form.append("<input type='hidden' name='basicInfoId' id='basicInfoId' value='"+basicInfoId+"'>");
				var td_jzs = form.find("#td_jzs");
				if(td_jzs.length > 0){
					var zybwhysjcs = $.trim(form.find("#zybwhysjcs").html());//职业病史
					var fmyghyfjzsDes = $.trim(form.find("#td_jzs").html());//接种史
					var zysDes = $.trim(form.find("#td_zys").html());//住院史
					var jtbcsDes = $.trim(form.find("#td_jtbcsDes").html());//家庭病床
					var yyqkDes = $.trim(form.find("#td_yy").html());//家庭病床
					form.append("<input type='hidden' name='shfsZybwhysjcs' value='"+zybwhysjcs+"'>");
					form.append("<input type='hidden' name='fmyghyfjzsDes' value='"+fmyghyfjzsDes+"'>");
					form.append("<input type='hidden' name='zysDes' value='"+zysDes+"'>");
					form.append("<input type='hidden' name='jtbcsDes' value='"+jtbcsDes+"'>");
					form.append("<input type='hidden' name='yyqkDes' value='"+yyqkDes+"'>");
				}
				form.submit();
				top.layer.close(index);
				top.layer.msg('保存成功');
			}else{
				var table = body.find("table");
				doSave(table, function(){
					top.layer.close(index);
					top.layer.msg('保存成功');
					loadGridData();
				});
			}
		  },
		  btn2 : function() {
			top.layer.close(index);
		  }
	});
	layer.full(index);
}

//打开窗口的按钮
//打开方式
//健康体检表id
//主表id
function fnAddHealthCheckTable(btn, openType, id, basicInfoId){
	var openT = 'add';
	if(openType == '编辑'){
		openT = 'edit';
	}else if(openType == '查看'){
		openT = 'detail';
	}
	
	var index = top.layer.open({
		title : openType + '体检表窗口',
		type : 2,
		scrollbar: false,
		area : [ '980px', '620px' ],
		btn : openT == 'detail' ? [] : [ '保存', '取消' ],
		content : '/front/phr/phrHealthCheck?id=' + (id || '') + "&openType=" + openT,
		yes : function() {
			var body = top.layer.getChildFrame('body');
			var form = body.find("form:first");
			form.append("<input type='hidden' name='requestFrom' id='requestFrom' value='doctor'>");	
			form.append("<input type='hidden' name='phrBasicInfoId' id='phrBasicInfoId' value='"+basicInfoId+"'>");
			form.submit();
			top.layer.close(index);
			top.layer.msg('保存体检表成功');
		},
		btn2 : function() {
			top.layer.close(index);
		}
	});
	
}
//封面
function fnAddCoverTable(btn, openType, id, basicInfoId, hasCover){
	
	if(hasCover){
		top.layer.alert('封面信息已存在');
		return;
	}
	
	var openT = 'add';
	if(openType == '编辑'){
		openT = 'edit';
	}else if(openType == '查看'){
		openT = 'detail';
	}
	
	var index = top.layer.open({
		title : openType + '档案封面窗口',
		type : 2,
		scrollbar: false,
		area : [ '980px', '620px' ],
		btn : openT == 'detail' ? [] : [ '保存', '取消' ],
		content : '/front/phr/phrCover?id=' + (id || '') + "&openType=" + openT + "&basicInfoId=" + basicInfoId,
		yes : function() {
			var body = top.layer.getChildFrame('body');
			var form = body.find("form:first");
			form.append("<input type='hidden' name='requestFrom' id='requestFrom' value='doctor'>");	
			form.append("<input type='hidden' name='basicInfoId' id='basicInfoId' value='"+basicInfoId+"'>");
			var params = Z.getUI2Params(form[0]);
			for(param in params){
				if(param != 'id' && param != 'requestFrom' && param != 'basicInfoId'){
					if(!params[param]){
						var v = body.find("#" + param).parent().parent().find("td:first").text().replace('：', '');
						top.layer.alert(v + "不能为空。");
						return;
					}
				}
			}
			
			form.submit();
			top.layer.close(index);
			top.layer.msg('保存体检表成功');
			top.location.reload();
		},
		btn2 : function() {
			top.layer.close(index);
		}
	});
	
}

//执行添加方法
function doSave(table, cb) {
	var o = {};
	o.id = getValueByIdOrName("id");
	o.patientId = getValueByIdOrName("patientId");
	o.name = getValueByIdOrName("name");
	if(!o.name){
		layerAlert('姓名不能为空');
		return;
	}
	o.userNo = getValueByIdOrName("userNo");
	if(!o.userNo){
		layerAlert('编号不能为空');
		return;
	}
	o.sex = getValueByIdOrName(null, "sex");
	o.birthday = getValueByIdOrName("birthday");
	if(!o.birthday){
		layerAlert('出生日期不能为空');
		return;
	}
	o.idCardNo = getValueByIdOrName("idCardNo") || '无';
	o.workUnit = getValueByIdOrName("workUnit") || '无';
	o.tel = getValueByIdOrName("tel");
	o.linkman = getValueByIdOrName("linkman");
	o.linkmanTel = getValueByIdOrName("linkmanTel");
	
	o.residentType = getValueByIdOrName(null, "residentType");
	o.nation = getValueByIdOrName(null, "nation");
	o.nationName = getValueByIdOrName("nationName");
	o.bloodType = getValueByIdOrName(null, "bloodType");
	if(!o.bloodType){
		layerAlert('请选择血型');
		return;
	}
	o.rhType = getValueByIdOrName(null, "rhType");
	o.degree = getValueByIdOrName(null, "degree");
	if(!o.degree){
		layerAlert('请选择文化程度');
		return;
	}
	o.profession = getValueByIdOrName(null, "profession");
	if(!o.profession){
		layerAlert('请选择职业');
		return;
	}
	o.maritalStatus = getValueByIdOrName(null, "maritalStatus");
	if(!o.maritalStatus){
		layerAlert('请选择婚姻状况');
		return;
	}
	o.payType = getValueByIdOrName(null, "payType");
	o.payTypeOther = getValueByIdOrName("payTypeOther");
	
	if(!o.payType){
		layerAlert('请选择医疗费用支付方式');
		return;
	}
	
	if(o.payType.indexOf('其他') > -1){
		if(!o.payTypeOther){
			layerAlert('请输入其他类型的支付方式名称');
			return;
		}
	}
	
	o.ywgms = getValueByIdOrName(null, "ywgms");
	o.ywgmsName = getValueByIdOrName("ywgmsName");
	o.bls = getValueByIdOrName("bls");
	o.ycbs = getValueByIdOrName(null, "ycbs") || getValueByIdOrName("ycbs");
	
	o.cjqk = getValueByIdOrName(null, "cjqk") || getValueByIdOrName("cjqk");
	o.shhjCfpfss = getValueByIdOrName(null, "shhjCfpfss");
	o.shhjRllx = getValueByIdOrName(null, "shhjRllx");
	o.shhjYs = getValueByIdOrName(null, "shhjYs");
	o.shhjCs = getValueByIdOrName(null, "shhjCs");
	o.shhjQcl = getValueByIdOrName(null, "shhjQcl");
	
	//其他
	o.jwsDiseaseDes = getDynamicDomValue('jb');
	o.jwsOperationDes = getDynamicDomValue('sh');
	o.jwsTraumaDes = getDynamicDomValue('ws');
	o.jwsTransfusionDes = getDynamicDomValue('sx');
	
	//家族史
	var jzsText = getDynamicDomValue('jzs');
	if(jzsText && jzsText != '无'){
		var a1 = [], a2 = [], a3 = [], a4 = [];
		var array = jzsText.split(",");
		for(var i=0;i<array.length;i++){
			var value = array[i];
			if(value.indexOf("父亲") > -1){
				a1.push(value);
			}else if(value.indexOf("母亲") > -1){
				a2.push(value);
			}else if(value.indexOf("兄弟姐妹") > -1){
				a3.push(value);
			}else if(value.indexOf("子女") > -1){
				a4.push(value);
			}
		}
		if(a1.length){
			o.jzsFq = a1.join(",");
		}
		if(a2.length){
			o.jzsMq = a2.join(",");
		}
		if(a3.length){
			o.jzsXdjm = a3.join(",");
		}
		if(a4.length){
			o.jzsZn = a4.join(",");
		}
	}
	
	$.post('/back/phr/phrAdd', o, function(rsp){
		if(rsp.status == 'success'){
			cb();
		}else{
			top.layer.alert(rsp.msg);
		}
	}, 'json');
	
	
	//private
	function getDynamicDomValue(typeStr){
		var trs = table.find("tr[type='dynamic_gen_"+typeStr+"']");
		if(trs.length == 0)
			return '无';
		var arr = [];
		trs.each(function(){
			var me = $(this);
			var input1 = $.trim(me.find("td:eq(0)").text());
			var input2 = $.trim(me.find("td:eq(1)").text());
			arr.push(input1 + ";" + input2);
		});
		return arr.join(",");
	}
	//private
	function getValueByIdOrName(id, name){
		if(id){
			return $.trim(table.find("#" + id).val());
		}
		if(name){
			var ary = [];
			table.find("input[name='"+name+"']:checked").each(function(){
				ary.push($.trim(this.value));
			});
			return ary.join(",");
		}
	}
	
}
