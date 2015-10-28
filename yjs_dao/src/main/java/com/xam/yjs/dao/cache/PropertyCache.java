package com.xam.yjs.dao.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.xam.yjs.core.def.PropertyDef;
import com.xam.yjs.core.meta.Property;
import com.xam.yjs.core.meta.PropertyType;


@Component
public class PropertyCache {


	public static Map<String, List<Property>> propType2Prop = new HashMap<String, List<Property>>();
	public static Map<String, Property> propKey2Prop = new HashMap<String, Property>();
	
	
	public void refresh() {
		propType2Prop.clear();
		propKey2Prop.clear();
		List<PropertyType> propertyTypeList = PropertyDef.getAllPropertyTypes();
		
		/* handle prodLine properties */
		for(PropertyType type : propertyTypeList) {
			propType2Prop.put(type.getName(), type.getProperties());

			for(Property prop : type.getProperties()) {
				String key = formPropertyKey(type.getName(), prop.getId()) ;
				propKey2Prop.put(key, prop);
			}
		}
	}
	
	public List<Property> findProperiesByType(String typeName)  {
		return propType2Prop.get(typeName);
	}
	
	public List<Property> findProperiesByType(PropertyType type)  {
		return propType2Prop.get(type.getName());
	}

	public Property findProperyByTypeAndId(String type, int id)  {
		Property ret = propKey2Prop.get(formPropertyKey(type, id));

		return ret;
	}
	
	public Property findProperyByTypeAndId(PropertyType type, int id)  {
		Property ret = propKey2Prop.get(formPropertyKey(type.getName(), id));

		return ret;
	}
	
	private String formPropertyKey(String type, int id) {
		return type + "_" + id;
	}
}
