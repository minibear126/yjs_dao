package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class SalesInfoDo extends BaseDo {

	/** id */
	int id;
	/** 用户id */
	int accountId;
	/** 开发商id */
	int developerId;
	/** 所在楼盘 */
	int buildId;
	/** 销售电话 */
	String saleTel;
	/** 名字 */
	String saleName;
	/** 邮件 */
	String email;
	/** 微信 */
	String weixin;
	/** 性别 */
	int sex;
	/** 1：开发商销售；2：代理公司销售；3：其他' */
	int type;
	/** 备注 */
	String describe;
	/** 销售所属公司 */
	String belonging;
	/** 是否是楼盘管理员 */
	int isMainBuilding;

	
	public static final String OBJECTKEY ="yjs:t_sales_info";
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
		
	public int getDeveloperId() {
		return this.developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
		
	public int getBuildId() {
		return this.buildId;
	}
	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}
		
	public String getSaleTel() {
		return this.saleTel;
	}
	public void setSaleTel(String saleTel) {
		this.saleTel = saleTel;
	}
		
	public String getSaleName() {
		return this.saleName;
	}
	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}
		
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	public String getWeixin() {
		return this.weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
		
	public int getSex() {
		return this.sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
		
	public int getType() {
		return this.type;
	}
	public void setType(int type) {
		this.type = type;
	}
		
	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
		
	public String getBelonging() {
		return this.belonging;
	}
	public void setBelonging(String belonging) {
		this.belonging = belonging;
	}
		
	public int getIsMainBuilding() {
		return this.isMainBuilding;
	}
	public void setIsMainBuilding(int isMainBuilding) {
		this.isMainBuilding = isMainBuilding;
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


