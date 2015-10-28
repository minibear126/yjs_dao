package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class BuildingInfoDo extends BaseDo {

	/** id */
	int id;
	/** 状态 */
	int status;
	/** 开发商id */
	int developerId;
	/** 国家 */
	int nationId;
	/** 省 */
	int provinceId;
	/** 市 */
	int cityId;
	/** 县 */
	int countryId;
	/** 楼盘详细地址 */
	String address;
	/** 销售详细地址 */
	String salesAddress;
	/** 公司经度 */
	String longitude;
	/** 公司纬度 */
	String latitude;
	/** 承建商 */
	String constructionCop;
	/** 联系人 */
	String contactName;
	/** 电话 */
	String tel;
	/** 传真 */
	String fax;
	/** 建筑类型 */
	int buildType;
	/** 售价 */
	String salePrice;
	/** 简介 */
	String describe;
	/** 待售房源 */
	int total;
	/** 开盘时间 */
	java.util.Date openTtime;
	/** 交付时间 */
	java.util.Date deliveryTime;
	/** 激励资金 */
	int incentiveFund;

	
	public static final String OBJECTKEY ="yjs:t_building_info";
	String CREATER;
	String LAST_USER;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
		
	public int getDeveloperId() {
		return this.developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
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
		
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
	public String getSalesAddress() {
		return this.salesAddress;
	}
	public void setSalesAddress(String salesAddress) {
		this.salesAddress = salesAddress;
	}
		
	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
		
	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
		
	public String getConstructionCop() {
		return this.constructionCop;
	}
	public void setConstructionCop(String constructionCop) {
		this.constructionCop = constructionCop;
	}
		
	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
		
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
		
	public String getFax() {
		return this.fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
		
	public int getBuildType() {
		return this.buildType;
	}
	public void setBuildType(int buildType) {
		this.buildType = buildType;
	}
		
	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
		
	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
		
	public int getTotal() {
		return this.total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
		
	public java.util.Date getOpenTtime() {
		return this.openTtime;
	}
	public void setOpenTtime(java.util.Date openTtime) {
		this.openTtime = openTtime;
	}
		
	public java.util.Date getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(java.util.Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
		
	public int getIncentiveFund() {
		return this.incentiveFund;
	}
	public void setIncentiveFund(int incentiveFund) {
		this.incentiveFund = incentiveFund;
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


