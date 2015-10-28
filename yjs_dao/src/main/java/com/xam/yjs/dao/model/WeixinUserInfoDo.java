package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class WeixinUserInfoDo extends BaseDo {

	/** id */
	String id;
	/** 用户的昵称 */
	String nickname;
	/** 分组名称 */
	String groupName;
	/** 城市 */
	String city;
	/** 国家 */
	String country;
	/** 省份 */
	String province;
	/** 语言 */
	String language;
	/** 头像 */
	String headimgurl;
	/** 主表 */
	int accountId;
	/** 分组id */
	int groupId;
	/** 是否关注 */
	int subscribe;
	/** 性别 */
	int sex;
	/** 关注时间 */
	long subscribe_time;

	
	public static final String OBJECTKEY ="yjs:t_weixin_user_info";
	String CREATER;
	String LAST_USER;
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	public String getNickname() {
		return this.nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
		
	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
		
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		
	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
		
	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
		
	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
		
	public String getHeadimgurl() {
		return this.headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
		
	public int getAccountId() {
		return this.accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
		
	public int getGroupId() {
		return this.groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
		
	public int getSubscribe() {
		return this.subscribe;
	}
	public void setSubscribe(int subscribe) {
		this.subscribe = subscribe;
	}
		
	public int getSex() {
		return this.sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
		
	public long getSubscribe_time() {
		return this.subscribe_time;
	}
	public void setSubscribe_time(long subscribe_time) {
		this.subscribe_time = subscribe_time;
	}
		
	public String getLAST_USER(){
		return this.LAST_USER;
	
	}
	
	public void setLAST_USER(String LAST_USER){
		this.LAST_USER=LAST_USER;
	
	}

	public String getCREATER(){
		return this.CREATER;
	
	}
	
	public void setCREATER(String CREATER){
		this.CREATER=CREATER;
	
	}
	

	public String getOBJECTKEY(){
		return OBJECTKEY;
	
	}
	
	

}


