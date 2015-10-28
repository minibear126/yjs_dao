package com.xam.yjs.core.base;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;


public class BaseBean {
	protected Logger logger = Logger.getLogger(this.getClass());

	protected void copy(BaseBean dest, BaseBean orig) {
		try {
			BeanUtils.copyProperties(dest, orig);
		} catch (Exception e) {
			logger.error("Error occured when copying values", e);
		} 
	}
	
//	public String toString() {
//		String ret = "";
//		ret += "\n";
//		try {
//			@SuppressWarnings("rawtypes")
//			Map props = BeanUtils.describe(this);
//			props.remove("class");
//			ret = props.toString();
//		} catch (Exception e) {
//			logger.error("Error occured when getting properties of BO", e);
//		}
//		
//		
//		
//
//		return ret;
//	}
}
