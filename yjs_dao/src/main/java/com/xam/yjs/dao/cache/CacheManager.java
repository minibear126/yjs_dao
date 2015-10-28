/**
 * 
 */
package com.xam.yjs.dao.cache;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
//@Component
public class CacheManager{
	
	private List<BaseDaoCache> cacheList = new ArrayList<BaseDaoCache>();
	
	@Autowired
	private PropertyCache propertyCache;
	
	
	/** PosstConstruct的方法将会在配置文件中指定的init-method先被调用 */
	@PostConstruct
	public void init() {
		
		
		/* PropertyCache是从PropertyDef.java中加载数据，所以可以在PostVonstruct的方法中调用 */
		propertyCache.refresh();
	}
	
	public void refreshAsGuest() {
		/* 下面的cache都是从DB中加载数据 */
		for(BaseDaoCache cache : cacheList) {
			cache.refresh(false);
		}
	}
	
	public void refreshAsAdmin() {
		/* 下面的cache都是从DB中加载数据 */
		//doExeitOther();
		for(BaseDaoCache cache : cacheList) {
			cache.refresh(true);
		}
		
		
	}


	public PropertyCache getPropertyCache() {
		return propertyCache;
	}

	public void setPropertyCache(PropertyCache propertyCache) {
		this.propertyCache = propertyCache;
	}

	
	
	
	
}
