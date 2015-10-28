package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class CollectUserBuildModDo extends BaseDo {

	/** id */
	String id;
	/** 用户id */
	int accountId;
	/** 楼书id */
	int buildModId;
	/** 服务顾问 */
	int salesId;
	/** 状态 */
	int status;

	
	public static final String OBJECTKEY ="yjs:t_collect_user_buildMod";
	String CREATER;
	String LAST_USER;
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	public int getAccountId() {
		return this.accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
		
	public int getBuildModId() {
		return this.buildModId;
	}
	public void setBuildModId(int buildModId) {
		this.buildModId = buildModId;
	}
		
	public int getSalesId() {
		return this.salesId;
	}
	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}
		
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
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


