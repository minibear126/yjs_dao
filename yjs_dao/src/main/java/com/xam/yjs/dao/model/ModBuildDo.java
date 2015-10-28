package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class ModBuildDo extends BaseDo {

	/** id */
	int id;
	/** 楼盘主键 */
	int buildId;
	/** 楼盘名字 */
	String buildName;
	/** 开发商描述 */
	String developerDes;
	/** 封面 */
	String cover;
	/** 地址 */
	String address;
	/** 经度 */
	String lon;
	/** 纬度 */
	String lat;
	/** 电话 */
	String tel;
	/** 售价 */
	String price;
	/** 楼盘简述 */
	String description;
	/** 活动简述 */
	String actionDes;
	/** 房源数 */
	int total;
	/** 开盘日期 */
	java.util.Date openTime;

	
	public static final String OBJECTKEY ="yjs:t_mod_build";
	String CREATER;
	String LAST_USER;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public int getBuildId() {
		return this.buildId;
	}
	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}
		
	public String getBuildName() {
		return this.buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
		
	public String getDeveloperDes() {
		return this.developerDes;
	}
	public void setDeveloperDes(String developerDes) {
		this.developerDes = developerDes;
	}
		
	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
		
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
	public String getLon() {
		return this.lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
		
	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
		
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
		
	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
		
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
	public String getActionDes() {
		return this.actionDes;
	}
	public void setActionDes(String actionDes) {
		this.actionDes = actionDes;
	}
		
	public int getTotal() {
		return this.total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
		
	public java.util.Date getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(java.util.Date openTime) {
		this.openTime = openTime;
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


