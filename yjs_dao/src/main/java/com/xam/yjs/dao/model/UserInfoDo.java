package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class UserInfoDo extends BaseDo {

	/** id */
	int id;
	/** 用户账户关联主键 */
	int accountId;
	/** 姓名 */
	String name;
	/** 推荐人id */
	int recommend;
	/** 国家 */
	int nationId;
	/** 省 */
	int provinceId;
	/** 城市 */
	int cityId;
	/** 县 */
	int countryId;
	/** 建议 */
	String suggest;
	/** 性别 */
	int sex;
	/** 账户状态 */
	int status;
	/** 地址 */
	String address;
	/** 电话 */
	String tel;
	/** 邮箱 */
	String email;
	/** 头像 */
	String imageUrl;
	/** 微信 */
	String weixin;
	/** 自述 */
	String content;
	/** 生日 */
	java.util.Date birthday;

	
	public static final String OBJECTKEY ="yjs:t_user_info";
	String CREATER;
	String LAST_USER;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public int getAccountId() {
		return this.accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
		
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public int getRecommend() {
		return this.recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
		
	public int getNationId() {
		return this.nationId;
	}
	public void setNationId(int nationId) {
		this.nationId = nationId;
	}
		
	public int getProvinceId() {
		return this.provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
		
	public int getCityId() {
		return this.cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
		
	public int getCountryId() {
		return this.countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
		
	public String getSuggest() {
		return this.suggest;
	}
	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
		
	public int getSex() {
		return this.sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
		
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
		
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
		
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
		
	public String getWeixin() {
		return this.weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
		
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
		
	public java.util.Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
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


