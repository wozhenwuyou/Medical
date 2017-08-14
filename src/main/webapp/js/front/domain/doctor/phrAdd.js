$(function() {
	highLightLeftMenu('lm_phr');
	initForm();

});

// 疾病
function fnAddUI(btn, typeStr) {
	var type = $("#" + typeStr + "Type").val();
	if ('无' == type)
		return;

	var time = $("#" + typeStr + "Sj").val();
	if (!time) {
		alert('请输入时间');
		return;
	}
	var str = '<tr height="40" valign="bottom" type="dynamic_gen_'
			+ typeStr
			+ '">\
					<td colspan="4">\
					<span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称：</span>\
						<input value="'
			+ type
			+ '" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />\
						 <span style="margin-top: 7px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间：</span>  \
						<input value="'
			+ time
			+ '" type="text" class="pre_text" readonly="readonly" style="width: 150px; float: none;border:none;" />\
						&nbsp;<a class="sub_but" href="javascript:;"\
						onclick="$(this).parent().parent().remove();"\
						style="float: none; padding: 5px 20px;"><font color=red>x</font></a>\
						</td>\
				</tr>';
	$(btn).parent().parent().after(str);

}

// 初始化患者的id
function initPatientInfo(id) {
	lh.post("front", "/phr/doctor/getPatient/" + id, {}, function(rsp) {
		if (rsp.success) {
			var data = rsp.patient;
			if (data) {
				$("#patientId").val(data.id);
				$('#name').val(data.realName);
				$("#sex").val(data.sex == 1 ? '男' : '女');
				$("#idCardNo").val(data.idcardNum);
				$("#birthday").val(
						data.birthday ? data.birthday.toDate()
								.fmt('yyyy-MM-dd') : '');
				$("#tel").val(data.phone);
			}
		} else {
			lh.alert(rsp.msg);
		}
	}, "json");
}

function initForm() {

	// 双击选择患者
	$("#name").dblclick(
			function() {
				var index = layer.open({
					type : 2,
					area : [ '550px', '500px' ],
					btn : [ '选择', '关闭' ],
					content : '/patientLibrary4Select',
					yes : function() {
						var chk = layer.getChildFrame(
								'[name="patientRadio"]:radio:checked', index);
						if (chk.length == 1) {
							initPatientInfo(chk.val());
							layer.close(index);
						}
					},
					btn2 : function() {
						layer.close(index);
					}
				});
			});

	$("#birthday").datetimepicker({
		bootcssVer : 3,
		format : 'yyyy-mm-dd',
		todayBtn : true,
		language : 'zh-CN',
		startView : 2,
		viewSelect : 'year',
		minView : 2, // 选择日期后，不会再跳转去选择时分秒
		autoclose : true
	// 选择日期后自动关闭
	});
	$("input[id$='Sj']").datetimepicker({
		bootcssVer : 3,
		format : 'yyyy-mm-dd',
		todayBtn : true,
		language : 'zh-CN',
		startView : 2,
		viewSelect : 'year',
		minView : 2, // 选择日期后，不会再跳转去选择时分秒
		autoclose : true
	// 选择日期后自动关闭
	});
	// 所有的checkbox都有特效，如果选择了无，则该组其他的都取消，如果选择了非无，则把无取消
	$(":checkbox")
			.click(
					function() {
						var $me = $(this);
						// 如果是选中
						if ($me.prop('checked')) {
							if ($me.val() == '无') {
								$me.parent().find(":checkbox:gt(0)").prop(
										'checked', false);
							} else {
								if ($me.parent().find("[value='无']:checkbox").length > 0) {
									$me.parent().find(":checkbox:eq(0)").prop(
											'checked', false);
								}
							}
						}
					});
}

function fnAddPhr() {

	var o = {};

	o.name = $("#name").val();

	if (!o.name) {
		lh.alert('姓名不能为空。');
		return;
	}

	o.userNo = $("#userNo").val();

	if (!o.userNo) {
		lh.alert('编号不能为空。');
		return;
	}

	o.sex = $("#sex").val();
	if (!o.sex) {
		lh.alert('请选择性别');
		return;
	}

	o.idCardNo = $("#idCardNo").val() || '无';
	o.birthday = $("#birthday").val();

	if (!o.birthday) {
		lh.alert('出生日期不能为空。');
		return;
	}

	o.workUnit = $("#workUnit").val() || '无';
	o.tel = $("#tel").val();
	o.linkman = $("#linkman").val();
	o.linkmanTel = $("#linkmanTel").val();
	o.residentType = $("#residentType").val();
	if (!o.residentType) {
		lh.alert('常住类型字段不能为空');
		return;
	}
	o.nation = $("input[name='nation']:checked").val();
	o.nationName = $("#nationName").val();
	if (o.nation == '汉族') {
		o.nationName = '';
	} else if (o.nation == '其他') {
		if (!o.nationName) {
			lh.alert('民族信息填写错误');
			return;
		}
	}
	o.bloodType = $("#bloodType").val();
	o.rhType = $("#rhType").val();
	o.degree = $("#degree").val();
	o.profession = $("#profession").val();
	o.maritalStatus = $("#maritalStatus").val();
	o.payType = $("#payType").val();
	if (!o.payType) {
		lh.alert('请选择医疗费用支付方式');
		return;
	}
	o.ycbs = $("#ycbs").val() || '无';

	o.bls = getChkboxValue('bls');
	o.ywgms = getChkboxValue('ywgms');
	o.jzsFq = getChkboxValue('jzsFq');
	o.jzsMq = getChkboxValue('jzsFq');
	o.jzsXdjm = getChkboxValue('jzsXdjm');
	o.jzsZn = getChkboxValue('jzsZn');

	o.cjqk = getChkboxValue('cjqk');
	o.shhjCfpfss = getChkboxValue('shhjCfpfss');
	o.shhjCs = getChkboxValue('shhjCs');
	o.shhjYs = getChkboxValue('shhjYs');
	o.shhjQcl = getChkboxValue('shhjQcl');
	o.shhjRllx = getChkboxValue('shhjRllx');

	// 其他
	o.jwsDiseaseDes = getDynamicDomValue('jb');
	o.jwsOperationDes = getDynamicDomValue('sh');
	o.jwsTraumaDes = getDynamicDomValue('ws');
	o.jwsTransfusionDes = getDynamicDomValue('sx');
	// 患者id
	o.patientId = $("#patientId").val();

	if (lh.preventRepeat()) {// 防止重复提交
		saveData(o);
	} else {
		lh.alert('请不要重复提交数据');
	}

}

function getDynamicDomValue(typeStr) {
	var trs = $("tr[type='dynamic_gen_" + typeStr + "']");
	if (trs.length == 0)
		return '无';
	var arr = [];
	trs.each(function() {
		var me = $(this);
		var input1 = $.trim(me.find("input:eq(0)").val());
		var input2 = $.trim(me.find("input:eq(1)").val());
		arr.push(input1 + ";" + input2);
	});
	return arr.join(",");
}

function getChkboxValue(chkName) {
	var chks = $("[name='" + chkName + "']:checkbox:checked");
	if (chks.length == 0) {
		return "无";
	}
	var arr = [];
	chks.each(function() {
		arr.push(this.value);
	});
	return arr.join(",");
}

function saveData(obj) {
	lh.post("front", "/phr/doctor/phrAdd", obj, function(rsp) {
		if (rsp.status == 'success') {
			lh.jumpToUrl('/phr/doctor/phrList');
			// layer.msg('保存成功',{time:1000}, function(){
			// location.reload();
			// });
		} else {
			lh.alert(rsp.msg);
		}
	}, "json");
}

function fnCheckUserNo(input) {

	var userNo = $.trim($(input).val());
	var id = $("#id").val();

	if (!userNo)
		return;

	var o = {};
	o.userNo = userNo;
	if (id) {
		o.id = id;
	}

	$.post("/phr/checkUserNo", o, function(json) {
		if(json && json.success && json.map.isRepeat){
			layer.alert("该档案号已被占用，请重新输入。");
		}
	}, "json");

}
