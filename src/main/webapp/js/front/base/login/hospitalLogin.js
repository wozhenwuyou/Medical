lh.loginType = 3;//登陆类型：诊所登陆
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
		var phone = localStorage.getItem("hospital_phone");
		var password = localStorage.getItem("hospital_password");
		if(phone){
			$('#phone').val(phone);
			$('#password').val(password);//这个项目只用记住账号
			$("#remember").attr('checked',true);
			if(password){
				var obj = {loginAccount:phone,password:password,loginType:'hospital'};
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
		window.localStorage.setItem("hospital_phone",phone);
		window.localStorage.setItem("hospital_password",password);
	}else{
		window.localStorage.removeItem('hospital_phone');
		window.localStorage.removeItem('hospital_password');
	}
	
	var obj = {loginAccount:phone,password:password,verificationCode:verificationCode,loginType:'hospital'};
	loginPost(obj);
}

function loginPost(obj, silent){
	if(silent)obj.silent = 1;
	lh.post("front", '/doLogin', obj, function(rsp){
		if(rsp.status == 'success'){
			lh.jumpToUrl('/hospital/hospitalHome');
		}else{
			lh.alert(rsp.msg);
		}
	}, 'json')
}

function loginQuickly(){
	var obj = {loginAccount:lh.test.phone,password:lh.test.password,verificationCode:1,loginType:'hospital'};
	lh.post("front", '/doLogin', obj, function(rsp){
		if(rsp.status == 'success'){
			lh.jumpToUrl('/hospital/hospitalHome');
		}else{
			lh.alert(rsp.msg);
		}
	}, 'json')
}

