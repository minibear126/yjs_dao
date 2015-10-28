package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class SubscribeUserToDeveloperDo extends BaseDo {

	/** id */
	String id;
	/** 用户id */
	int accountId;
	/** 客户来源 */
	int fromBuildId;
	/** 被关注开发商id */
	int subscribeDevelopId;
	/** 状态 */
	int status;
	/** 权限 */
	int authority;

	
	public static final String OBJECTKEY ="yjs:t_subscribe_user_to_developer";
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
		
	public int getFromBuildId() {
		return this.fromBuildId;
	}
	public void setFromBuildId(int fromBuildId) {
		this.fromBuildId = fromBuildId;
	}
		
	public int getSubscribeDevelopId() {
		return this.subscribeDevelopId;
	}
	public void setSubscribeDevelopId(int subscribeDevelopId) {
		this.subscribeDevelopId = subscribeDevelopId;
	}
		
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
		
	public int getAuthority() {
		return this.authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
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


