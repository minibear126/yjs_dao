package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class UserToDeveloperDo extends BaseDo {

	/** id */
	int id;
	/** 用户id */
	int accountId;
	/** 开发商id */
	int developerId;
	/** 所在部门 */
	String department;
	/** 备注 */
	String remark;
	/** 状态 */
	int status;
	/** 是否为开发商管理员 */
	int isMainDeveloper;

	
	public static final String OBJECTKEY ="yjs:t_user_to_developer";
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
		
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
		
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
		
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
		
	public int getIsMainDeveloper() {
		return this.isMainDeveloper;
	}
	public void setIsMainDeveloper(int isMainDeveloper) {
		this.isMainDeveloper = isMainDeveloper;
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


