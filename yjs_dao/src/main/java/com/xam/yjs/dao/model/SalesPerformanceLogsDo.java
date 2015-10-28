package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class SalesPerformanceLogsDo extends BaseDo {

	/** id */
	String id;
	/** 积分信息主键 */
	int performanceId;
	/** 积分增减 */
	int vantages;
	/** 积分使用事件 */
	int eventId;
	/** 积分使用名称 */
	String eventName;
	/** 销售房源简介 */
	String buildDes;

	
	public static final String OBJECTKEY ="yjs:t_sales_performance_logs";
	String CREATER;
	String LAST_USER;
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	public int getPerformanceId() {
		return this.performanceId;
	}
	public void setPerformanceId(int performanceId) {
		this.performanceId = performanceId;
	}
		
	public int getVantages() {
		return this.vantages;
	}
	public void setVantages(int vantages) {
		this.vantages = vantages;
	}
		
	public int getEventId() {
		return this.eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
		
	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
		
	public String getBuildDes() {
		return this.buildDes;
	}
	public void setBuildDes(String buildDes) {
		this.buildDes = buildDes;
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


