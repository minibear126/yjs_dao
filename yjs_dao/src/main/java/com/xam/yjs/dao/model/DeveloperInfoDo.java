package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class DeveloperInfoDo extends BaseDo {

	/** id */
	int id;
	/** 状态 */
	int status;
	/** 国家 */
	int nationId;
	/** 省 */
	int provinceId;
	/** 市 */
	int cityId;
	/** 县 */
	int countryId;
	/** 详细地址 */
	String address;
	/** 公司经度 */
	String longitude;
	/** 公司纬度 */
	String latitude;
	/** 公司营业执照 */
	String license;
	/** 开发商名称 */
	String developerName;
	/** 联系人 */
	String contactName;
	/** 电话 */
	String tel;
	/** 传真 */
	String fax;

	
	public static final String OBJECTKEY ="yjs:t_developer_info";
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
		
	public String getLicense() {
		return this.license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
		
	public String getDeveloperName() {
		return this.developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
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


