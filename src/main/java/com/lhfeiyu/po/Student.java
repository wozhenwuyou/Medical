package com.lhfeiyu.po;

import com.alibaba.fastjson.JSONObject;

/**
 * <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 持久层对象 <p>
 * <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
 * <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
 * <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司<p>
 * <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 1.0<p>
 */
public class Student extends Parent {

	/**============================== 自定义字段 开始 _@CAUTION_SELF_FIELD_BEGIN@_ ==============================*/
	
	/**============================== 自定义字段 结束 _@CAUTION_SELF_FIELD_FINISH@_ ==============================*/

	/**   */
	private String name;
	
	/**   */
	private String area;
	
	/**   */
	private String phone;
	
	/**   */
	private Integer id;
	
	/**   */
	private String sex;
	
	/**   */
	private String qq;
	
	/**   */
	private String weixin;
	
	/**   */
	private String avatar;
	
	/**   */
	private String deletedAt;
	
	
	public String toString(){
    	return JSONObject.toJSONString(this);
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name = name == null ? null : name.trim();
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		 this.area = area == null ? null : area.trim();
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		 this.phone = phone == null ? null : phone.trim();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		 this.sex = sex == null ? null : sex.trim();
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		 this.qq = qq == null ? null : qq.trim();
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		 this.weixin = weixin == null ? null : weixin.trim();
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		 this.avatar = avatar == null ? null : avatar.trim();
	}
	public String getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(String deletedAt) {
		 this.deletedAt = deletedAt == null ? null : deletedAt.trim();
	}
	
	/**=========================== 自定义GETSET方法开始 _@CAUTION_SELF_GETSET_BEGIN@_ ===========================*/
	
	/**=========================== 自定义GETSET方法结束 _@CAUTION_SELF_GETSET_FINISH@_ ===========================*/
	
}