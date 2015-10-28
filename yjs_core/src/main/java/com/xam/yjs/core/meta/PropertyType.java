package com.xam.yjs.core.meta;

import java.util.List;

public class PropertyType {

	private String name;
	private List<Property> properties;
	private String description;
	
	public PropertyType(){}
	
	public PropertyType(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCanonicalName() {
		String ret = name.toUpperCase();
		return ret.replaceAll("[^0-9A-Z]", "_");
	}
}
