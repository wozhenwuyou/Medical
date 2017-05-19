$(function(){

});



function passwordReset(){
	var userType = lh.loginType;
	var loginAccount = $("#loginAccount1").val();
	if(!loginAccount){
		$("#pswd_set_tip").text('请输入您注册的手机号。');
		return;
	}
	var newPassword = $("#newPassword1").val();
	if(!newPassword){
		$("#pswd_set_tip").text('请输入您的新密码。');
		return;
	}
	var emailVerifyCode = $("#emailVerifyCode1").val();
	if(!emailVerifyCode){
		$("#pswd_set_tip").text('请输入您收到的验证码。');
		return;
	}
	
	lh.post("front", '/resetPassword', {userType:userType,emailVerifyCode:emailVerifyCode,newPassword:newPassword}, function(rsp){
		if(rsp.success){
			$("#pswd_set_tip").text('您的登陆密码已经重置成功！');
			setTimeout(lh.reload, 1000);
		}else{
			$("#pswd_set_tip").text(rsp.msg);
		}
	}, 'json');
	
}

function sendEmailVerifyCode(){
	var userType = lh.loginType;
	var loginAccount = $("#loginAccount1").val();
	if(!loginAccount){
		$("#pswd_set_tip").text('请输入您注册的手机号。');
		return;
	}
	
	lh.post("front", '/sendMailForResetPassword', {userType:userType,loginAccount:loginAccount}, function(rsp){
		if(rsp.success){
			$("#pswd_set_tip").text('验证码已发送到您的邮箱,请及时查看！');
		}else{
			$("#pswd_set_tip").text(rsp.msg);
		}
	}, 'json');
	
	
}
