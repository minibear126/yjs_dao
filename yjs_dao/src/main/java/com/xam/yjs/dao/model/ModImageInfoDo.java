package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class ModImageInfoDo extends BaseDo {

	/** id */
	int id;
	/** 楼盘ID */
	int buildId;
	/** 1户型2样板房3周边 */
	int type;
	/** 图片顺序 */
	int order;
	/** 说明 */
	String des;
	/** 图片名称 */
	String name;
	/** 图片路径 */
	String url;

	
	public static final String OBJECTKEY ="yjs:t_mod_image_info";
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
		
	public int getType() {
		return this.type;
	}
	public void setType(int type) {
		this.type = type;
	}
		
	public int getOrder() {
		return this.order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
		
	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}
		
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
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


