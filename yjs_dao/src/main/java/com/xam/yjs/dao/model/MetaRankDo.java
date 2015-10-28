package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class MetaRankDo extends BaseDo {

	/** id */
	int id;
	/** 1顾客2销售 */
	int type;
	/** 名字 */
	String name;
	/** 层级 */
	int level;
	/** 头像 */
	String image;
	/** 最小积分值 */
	int minPoint;

	
	public static final String OBJECTKEY ="yjs:t_meta_rank";
	String CREATER;
	String LAST_USER;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public int getType() {
		return this.type;
	}
	public void setType(int type) {
		this.type = type;
	}
		
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	public int getLevel() {
		return this.level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
		
	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}
		
	public int getMinPoint() {
		return this.minPoint;
	}
	public void setMinPoint(int minPoint) {
		this.minPoint = minPoint;
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


