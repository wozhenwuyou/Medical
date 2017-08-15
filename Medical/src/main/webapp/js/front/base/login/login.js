lh.loginType = 1;//登陆类型：用户登陆
$(function(){
	initData();
	doInit();
});

function initData(){
	loadRandomCode();
}

function loadRandomCode(){ 
	$('#imgcode').attr('src','/login/loadVerificationCode?id='+parseInt(1000*Math.random()));
}

function doInit(){
	if(window.localStorage){
		var phone = localStorage.getItem("user_phone");
		var password = localStorage.getItem("user_password");
		if(phone){
			$('#phone').val(phone);
			$('#password').val(password);//这个项目只用记住账号
			$("#remember").attr('checked',true);
			if(password){
				var obj = {loginAccount:phone,password:password,loginType:'user'};
				loginPost(obj, 1);
			}
		}
	}
	$(window).keydown(function(event){
		if(event.keyCode == '13'){
			 doMobileLogin();
		}
	});
}

function doMobileLogin(){
	var phone = $("#phone").val();
	if(!phone){
		$("#phoneTip").show();
		return;
	}
	var password = $("#password").val();
	if(!password){
		$("#passwordTip").show();
		return;
	}
	var verificationCode = $("#verificationCode").val();
	if(!verificationCode){
		$("#verificationCodeTip").show();
		return;
	}
	
	if($("#remember").is(':checked')){
		window.localStorage.setItem("user_phone",phone);
		window.localStorage.setItem("user_password",password);
	}else{
		window.localStorage.removeItem('user_phone');
		window.localStorage.removeItem('user_password');
	}
	
	var obj = {loginAccount:phone,password:password,verificationCode:verificationCode,loginType:'user'};
	loginPost(obj, 1);
	
}

function loginPost(obj, silent){
	if(silent)obj.silent = 1;
	lh.post("front", '/doLogin', obj, function(rsp){
		if(rsp.status == 'success'){
			var targetId = locache.get("user_li_id");
			if(null != targetId && "" != targetId){
				locache.set("user_li_id", 4);
				lh.jumpToUrl('/userReportList');
			}else{
				locache.set("user_li_id", 1);
				lh.jumpToUrl('/userBaseInformation');
			}
		}else{
			lh.alert(rsp.msg);
		}
	}, 'json')
}

function loginQuickly(){
	var obj = {loginAccount:lh.test.phone,password:lh.test.password,verificationCode:1};
	lh.post("front", '/doLogin', obj, function(rsp){
		if(rsp.status == 'success'){
			var targetId = locache.get("user_li_id");
			if(null != targetId && "" != targetId){
				locache.set("user_li_id", 4);
				lh.jumpToUrl('/userReportList');
			}else{
				locache.set("user_li_id", 1);
				lh.jumpToUrl('/userBaseInformation');
			}
		}else{
			lh.alert(rsp.msg);
		}
	}, 'json')
}