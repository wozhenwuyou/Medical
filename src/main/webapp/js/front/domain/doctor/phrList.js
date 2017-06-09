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
	
	lh.post('front', '/phr/doctor/phrList', {
		page : page,
		rows : size,
		name : name,
		userNo : userNo,
		idCardNo : idCardNo
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
	loadGridData();
}

function buildDom(data) {
	var rows = data.rows;
	var sessionDoctorId = data.doctorId;
	var obj = {
		rows : rows,
		isOwner : function() {
			return sessionDoctorId == this.doctorId;
		},
		createDate : function() {
			return lh.formatDate({
				date : this.diagnoseTime
			});
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
		  title: '<font color=red>【{0}】</font>的档案信息'.format(name), //不显示标题
		  area : [ '1000px', '680px' ],
		  content: '/views/front/domain/doctor/catalog.jsp?basicInfoId=' + basicInfoId, 
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
		  title: '<font color=red>【{0}】</font>的档案信息'.format(name), //不显示标题
		  area : [ '1000px', '680px' ],
		  content: '/views/front/domain/doctor/catalog.jsp?basicInfoId=' + basicInfoId, 
		  yes : function() {
			var body = $(window.frames[1].frames[0].document.body);
			var form = body.find("form:first");
			form.append("<input type='hidden' name='requestFrom' id='requestFrom' value='doctor'>");
			form.append("<input type='hidden' name='phrBasicInfoId' id='phrBasicInfoId' value='"+basicInfoId+"'>");
			form.append("<input type='hidden' name='basicInfoId' id='basicInfoId' value='"+basicInfoId+"'>");
			form.submit();
			top.layer.close(index);
			top.layer.msg('保存成功');
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
		title : openType + '体检表窗口',
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

