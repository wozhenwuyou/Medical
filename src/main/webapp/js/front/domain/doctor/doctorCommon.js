
$(function(){
	var s_count = $("#slideBox .bd img").length;
	var s_li = "";
	for (j = 1; j <= s_count; j++) {
			s_li += "<li>"+j+"</li>";
		}
	$("#doctorAdvertisement").html("<ul>" + s_li + "</ul>");
	initCommonPage();
});

function initCommonPage(){
	jQuery(".Box").slide({mainCell:".bd ul",autoPlay:true});
	jQuery(".txtScroll-top").slide({mainCell:".bd ul",autoPage:true,effect:"top",autoPlay:true,vis:1});
    jQuery(".pz_tab").slide({});
}


function searchDoctor(){
	var searchDoctorName = $("#searchDoctorName").val();
	if(!searchDoctorName){
		lh.alert('请输入需要查找的医生姓名');return;
	}
	lh.jumpToUrl("/doctorList?searchDoctorName="+searchDoctorName);
}

function highLightLeftMenu(menuId){
	$('#leftMenuList li a').css('color', '#444444').css('background-color', '');
	$('#'+menuId+' a').css('color', 'white').css('background-color', '#63a13f');
}