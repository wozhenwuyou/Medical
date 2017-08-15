package com.lhfeiyu.config;

import com.lhfeiyu.util.Md5Util;

/**
 * <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 配置包：常量配置类（运营）（继承基础常量配置类）
 * <p>
 * <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华
 * <p>
 * <strong> 编写时间：</strong> 2016年4月12日12:06:03
 * <p>
 * <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 http://lhfeiyu.com
 * <p>
 * <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0
 * <p>
 * <strong> 备&nbsp;&nbsp;&nbsp;&nbsp;注：</strong>
 * 包路径：com.lhfeiyu.config.ConstField
 * <p>
 */
public class Const  {

	public static final String mail_host = "smtp.hichina.com";// 阿里云企业邮箱// http://mail.hichina.com/alimail/
	public static final String mail_auth = "true";
	public static final String mail_user = "ywwz@wonature.com";
	public static final String mail_password = "y@123456";
	public static final String mail_sendFrom = "ywwz@wonature.com";
	public static final String mail_passwordResetTitle = "沃诊无忧密码重置验证码";
	public static final String mail_passwordResetContentTemplate = 
			"【沃诊无忧】您好，您正在进行密码重置，您的验证码是：_@REPLACE@_，10分钟内有效。如非本人操作请忽略本邮件。";//<a href=\"http://www.wozhenwuyou.com/\">点击访问沃诊无忧</a>
	
	public static final String db_username = "root";
	public static final String db_password = "lhfeiyuwozhen";
	

	public static final String web_base_url = "";

	public static final String rl_ytx_sid = "";
	public static final String rl_ytx_authToken = "";
	public static final String rl_ytx_appId = "";

	public static final String rl_ytx_appToken = "32463f3d748492e4302e7f478fc77863";

	public static final String rl_ytx_ipHttps = "https://app.cloopen.com";// REST服务器IP
	public static final String rl_ytx_ip = "app.cloopen.com";// REST服务器IP
	public static final String rl_ytx_port = "8883";// REST服务器端口
	public static final String rl_ytx_ip_port = "https://app.cloopen.com:8883";// REST服务器IP+端口
	// 上线后：sandboxapp -> app
	public static final String rl_ytx_base_sub_url = "https://app.cloopen.com:8883/2013-12-26/SubAccounts/";
	public static final String rl_ytx_base_main_url = "https://app.cloopen.com:8883/2013-12-26/Accounts/8a48b551523a5c1201523dbb47ea0666";
	public static final String rl_ytx_push_url = "https://app.cloopen.com:8883/2013-12-26/Accounts/8a48b551523a5c1201523dbb47ea0666/IM/PushMsg?sig=";

	public static final String rl_ytx_default_subAccount = "4b4aa7d6ba8511e59288ac853d9f54f2";
	public static final String rl_ytx_default_password = "3c7ae373d513e396226e7b658500cf47";
	public static final String rl_ytx_default_voip = "8008953800000002";
	public static final String rl_ytx_default_voip_pswd = "cVSsuUVJ";

	public static final String rl_ytx_msg_moban_id = "62710";

	public static final String rl_ytx_msg_moban_notice_id = "62639";

	public static String generateSig(String timeStamp) {// 目前采用的是帐号密码登陆，后期需要改为应用登陆
														// -
														// JS端采用就用登陆，服务器端采用账号登陆
		/// {SoftVersion}/Accounts/{accountSid}/IM/PushMsg
		// https://app.cloopen.com:8883/2013-12-26/SubAccounts/{subAccountSid}/{func}/{funcdes}?sig={SigParameter}
		// 使用MD5加密（主帐号Id + 主帐号授权令牌 +时间戳）。其中主帐号Id和主帐号授权令牌分别对应管理控制台中的 ACCOUNT
		/// SID和AUTH TOKEN。
		// 时间戳是当前系统时间，格式"yyyyMMddHHmmss"。时间戳有效时间为24小时，如：20140416142030
		String sid = Const.rl_ytx_sid;
		String authToken = Const.rl_ytx_authToken;
		String sig = Md5Util.encrypt(sid + authToken + timeStamp);
		return sig;
	}

	public static String generateSubSig(String subAccount, String password, String timeStamp) {// 帐号密码登陆
		String subSig = Md5Util.encrypt(subAccount + password + timeStamp);
		return subSig;
	}

	public static String generateSubSig(String userSerial, String timeStamp) {// 应用登陆
		String appId = Const.rl_ytx_appId;
		String appToken = Const.rl_ytx_appToken;
		String subSig = Md5Util.encrypt(appId + userSerial + timeStamp + appToken);
		return subSig;
	}

	public static String getPushMsgUrl(String timeStamp) {
		String baseUrl = Const.rl_ytx_push_url;
		String url = baseUrl + generateSig(timeStamp);
		return url;
	}

	public static String getAuthorization(String timeStamp) {
		String sid = Const.rl_ytx_sid;
		String authStr = sid + ":" + timeStamp;
		String authorization = Md5Util.base64Encode(authStr.getBytes());
		return authorization;
	}

	public static String getSubAuthorization(String subAccount, String timeStamp) {
		String authStr = subAccount + ":" + timeStamp;
		String authorization = Md5Util.base64Encode(authStr.getBytes());
		return authorization;
	}

}
