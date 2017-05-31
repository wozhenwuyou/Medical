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
