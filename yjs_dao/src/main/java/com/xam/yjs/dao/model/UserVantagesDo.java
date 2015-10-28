package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class UserVantagesDo extends BaseDo {

	/** id */
	int id;
	/** 用户账户关联主键 */
	int accountId;
	/** 总积分 */
	int avantages;
	/** 可用积分 */
	int validVantages;
	/** 普通顾客介绍销售房源 */
	int total;
	/** 积分等级 */
	int rankId;

	
	public static final String OBJECTKEY ="yjs:t_user_vantages";
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
		
	public int getAvantages() {
		return this.avantages;
	}
	public void setAvantages(int avantages) {
		this.avantages = avantages;
	}
		
	public int getValidVantages() {
		return this.validVantages;
	}
	public void setValidVantages(int validVantages) {
		this.validVantages = validVantages;
	}
		
	public int getTotal() {
		return this.total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
		
	public int getRankId() {
		return this.rankId;
	}
	public void setRankId(int rankId) {
		this.rankId = rankId;
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


