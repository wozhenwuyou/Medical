
$(function(){
	initCommonPage();
	var s_count = $("#slideBox .bd img").length;
	var s_li = "";
	for (j = 1; j <= s_count; j++) {
			s_li += "<li>"+j+"</li>";
		}
	$("#hospitalAdvertisement").html("<ul>" + s_li + "</ul>");
});

function initCommonPage(){
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	jQuery(".txtScroll-top").slide({mainCell:".bd ul",autoPage:true,effect:"top",autoPlay:true,vis:1});
    jQuery(".pz_tab").slide({});
}

function highLightLeftMenu(menuId){
	$('#leftMenuList li a').css('color', '#444444').css('background-color', '');
	$('#'+menuId+' a').css('color', 'white').css('background-color', '#63a13f');
}

function saveDoctorResult(){
	var reportId = $("#reportId").val();
	var doctorResult = $("#doctorResult").val();
	var obj = {id:reportId,doctorResult:doctorResult};
	lh.post("front", "/hospital/updateReportDoctorResult", obj, function(rsp){
		if(rsp.status == 'success'){
			lh.jumpToUrl('/hospital/hospitalUserReportList');
		}else{
			lh.alert(rsp.msg);
		}
	}, "json");
}