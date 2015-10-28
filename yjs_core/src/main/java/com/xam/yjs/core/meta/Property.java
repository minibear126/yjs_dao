package com.xam.yjs.core.meta;

import java.io.Serializable;

public class Property implements Serializable{
	private int id;
	private String name;
	private String nameZh;
	/* add supplement for color type property, used as color code */
	private String supplement;
	
	public Property() {}
	
	public Property(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Property(int id, String name, String nameZh) {
		this.id = id;
		this.name = name;
		this.nameZh = nameZh;
	}
	
	public Property(int id, String name, String nameZh, String supplement) {
		this.id = id;
		this.name = name;
		this.nameZh = nameZh;
		this.supplement = supplement;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNameZh() {
		return nameZh;
	}

	public void setNameZh(String nameZh) {
		this.nameZh = nameZh;
	}

	public String getSupplement() {
		return supplement;
	}

	public void setSupplement(String supplement) {
		this.supplement = supplement;
	}
	
	/* 本方法返回的字符串是用来生成Property变量名称的；
	 * Property变量的命名规则是：PROP_PROPERTI-TYPE_PROPERTY-NAME */
	public String getCanonicalName() {
		String ret = name.toUpperCase();
		return ret.replaceAll("[^0-9A-Z]", "_");
	}
	
}
