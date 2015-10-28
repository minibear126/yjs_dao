package com.xam.yjs.dao.cache;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.xam.yjs.core.base.BaseCache;
import com.xam.yjs.core.base.BaseDo;




public abstract class BaseDaoCache extends BaseCache implements Serializable{
	
//	protected static final String CATEGORY_CACHE = "libra_category_cache";
//	protected static final String GOODS_PROPERTY_CACHE = "libra_goods_property_cache";
//	protected static final String GOODS_PROPERTY_VALUE_CACHE = "libra_goods_property_value_cache";
//	protected static final String NAV_BAR_CACHE = "libra_nav_bar_cache";
//	protected static final String REGION_CACHE = "libra_region_cache"; 
//	protected static final String SYS_PROPERTY_VALUE_CACHE = "libra_sys_property_value_cache";
	
//	public static final String SYS_PROPERTY_CACHE = "libra_sys_property_cache";
//	public static final String PROPERTY_TYPE_CACHE = "libra_property_type_cache"; 
//	public static final String PROPERTY_KEY_CACHE = "libra_property_key_cache";
	
	static String EXTERNAL_CACHE_NAME_PREFIX = "LIBRA_CACHE_";
	
	
	private static Map<Class<? extends BaseDo>, String> cacheClass2ExternalCacheName = 
			new HashMap<Class<? extends BaseDo>, String>();
	
	static {
		}
	
	protected String getExternalCacheName(Class<? extends BaseDo> clazz) {
		return cacheClass2ExternalCacheName.get(clazz);
	}
	
	/** 
	 * asAdmin: 是否以Admin身份调用该方法。
	 * 如果是，则从DB中读取数据，写入Memcached，最后赋值给本地cache变量，
	 * 否则，将首先从Memcached中加载，如果加载不到数据，才会从DB中读取，最后赋值给本地cache变量；
	 *  */
	public void refresh(boolean isAsAdmin) {
		this.clearLocalCache();
		if(isAsAdmin) {
			/* 如果以管理员身份调用，则先从数据库中加载数据，然后更新Memcached */
			this.loadFromDb();
			this.updateExternalCache();
		} else {
			/* 如果以Guest身份访问，则先从Memcached加载数据，并填充本地cache */
			this.loadFromExternalCache();
			/* 检查本地cache中是否有数据 */
			if(!this.checkLocalCache()) {
				/* 如果从没有加载到，说明Memcache中没有相应数据，则以Admin身份运行Refresh */
				refresh(true);
			}
		}
	}
	
	/** 模板方法：清空本地cache */
	abstract public void clearLocalCache();
	
	/** 模板方法：从数据库中加载数据，并填充到本地cache */
	abstract public void loadFromDb();
	
	/** 模板方法：从Memcached中加载cache数据，并填充到本地cache */
	abstract public void loadFromExternalCache();
	
	/** 模板方法：检查本地cache中是否有数据 */
	abstract public boolean checkLocalCache();
	
	/** 模板方法：将本地cache更新到Memcache中 */
	abstract public void updateExternalCache();
	
	
	
}
