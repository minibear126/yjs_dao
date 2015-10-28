package com.xam.yjs.dao.util;

import java.text.SimpleDateFormat;
import java.util.Date;



public class RedisConst {
	public static final String PRODUCTSORT = "AllProduct";
	public static final String PRODUCTCOUNT = "Product:";
	public static final String CLASSINFO = "CLASSINFO:";
	public static final String CLASSSORT = "AllClass";
	public static final String TEMPININGBONAME="temp:iningbo:index";
	public static final String TEMPININGBONAMEAdver = "temp:iningbo:adver";
	public static final String TEMPININGBONAMEWZB = "temp:iningbo:wzb";
	public static final String TEMPININGBONAMENews = "temp:iningbo:news";
	public static String IndexDate = "";
	public static String Hour = "";
	public static String MMss="";
	
	public static String getIndexDate() {
		if("".equals(IndexDate)){
			SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd");
			IndexDate=sf.format(new Date());
			
		}
		return IndexDate;
	}
	public static void setIndexDate(String indexDate) {
		IndexDate = indexDate;
	}
	public static String getHour() {
		return Hour;
	}
	public static void setHour(String hour) {
		Hour = hour;
	}
	public static String getMMss() {
		return MMss;
	}
	public static void setMMss(String mMss) {
		MMss = mMss;
	}
	
	
}
