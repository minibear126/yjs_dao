package com.xam.yjs.core.def;

import java.util.ArrayList;
import java.util.List;

import com.xam.yjs.core.meta.Property;
import com.xam.yjs.core.meta.PropertyType;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果有需要，请修改property-def.xml中的定义，然后重新自动生成
 */
 
public class PropertyDef {

	/* 属性类型定义 */
	/* 发送方式 */
	public static PropertyType PROP_TYPE_MESSAGE_PUSHTYPE = new PropertyType("Message pushType", "发送方式");
	/* 产品状态 */
	public static PropertyType PROP_TYPE_PRODUCT_STATUS = new PropertyType("Product Status", "产品状态");
	/* 支付方式 */
	public static PropertyType PROP_TYPE_ORDER_PAYMENT_TYPE = new PropertyType("Order Payment Type", "支付方式");
	/* 支付状态 */
	public static PropertyType PROP_TYPE_ORDER_PAY_STATUS = new PropertyType("Order Pay Status", "支付状态");
	/* 支付错误处理状态 */
	public static PropertyType PROP_TYPE_ORDER_ERROR_STATUS = new PropertyType("Order Error Status", "支付错误处理状态");
	
	/* Property定义 */
	
	/* 属性类型 [发送方式] 的属性定义 */
	public static Property PROP_MESSAGE_PUSHTYPE_UNKNOW_ = new Property(0, "Unknow ", "未知", "");
	public static Property PROP_MESSAGE_PUSHTYPE_APP_IOS_OR_ANDROID = new Property(1, "App IOS Or Android", "发送给站内App", "");
	public static Property PROP_MESSAGE_PUSHTYPE_PUSH_ALL_ANDROID = new Property(2, "Push All Android", "安卓群发", "");
	public static Property PROP_MESSAGE_PUSHTYPE_PUSH_ALL_IOS = new Property(3, "Push all IOS", "ios群发", "");
	public static Property PROP_MESSAGE_PUSHTYPE_PUSH_ALL_APP = new Property(4, "Push All App", "所有app群发", "");
	
	/* 属性类型 [产品状态] 的属性定义 */
	public static Property PROP_PRODUCT_STATUS_UNKNOW_ = new Property(0, "Unknow ", "默认", "");
	public static Property PROP_PRODUCT_STATUS_PRODUCT_WAIT_FOR_AUTO = new Property(1, "Product Wait For Auto", "待审核", "");
	public static Property PROP_PRODUCT_STATUS_PRODUCT_AUTO_SUCCESS = new Property(2, "Product Auto Success", "审核成功", "");
	public static Property PROP_PRODUCT_STATUS_PRODUCT_AUTO_FAILD = new Property(3, "Product Auto Faild", "审核失败", "");
	public static Property PROP_PRODUCT_STATUS_PRODUCT_OFF_SHELF = new Property(4, "Product Off Shelf", "下架", "");
	
	/* 属性类型 [支付方式] 的属性定义 */
	public static Property PROP_ORDER_PAYMENT_TYPE_DEFAULT = new Property(0, "Default", "默认", "");
	public static Property PROP_ORDER_PAYMENT_TYPE_ALI_PAY = new Property(1, "Ali Pay", "支付宝", "");
	public static Property PROP_ORDER_PAYMENT_TYPE_ALI_WAP_PAY = new Property(2, "Ali Wap Pay", "支付宝手机端", "");
	public static Property PROP_ORDER_PAYMENT_TYPE_ALI_APP_PAY = new Property(3, "Ali App Pay", "支付宝App手机端", "");
	
	/* 属性类型 [支付状态] 的属性定义 */
	public static Property PROP_ORDER_PAY_STATUS_DEFAULT = new Property(0, "Default", "默认", "");
	public static Property PROP_ORDER_PAY_STATUS_PAY_CREATER = new Property(1, "Pay Creater", "支付创建", "");
	public static Property PROP_ORDER_PAY_STATUS_PAY_SUCCESSFUL = new Property(2, "Pay Successful", "支付成功", "");
	public static Property PROP_ORDER_PAY_STATUS_PAY_FAILED = new Property(3, "Pay Failed", "支付失败", "");
	
	/* 属性类型 [支付错误处理状态] 的属性定义 */
	public static Property PROP_ORDER_ERROR_STATUS_DEFAULT = new Property(0, "Default", "默认", "");
	public static Property PROP_ORDER_ERROR_STATUS_SOLVE_SUCCESSFUL = new Property(1, "Solve Successful", "未处理", "");
	public static Property PROP_ORDER_ERROR_STATUS_SOLVE_FAILED = new Property(2, "Solve Failed", "处理成功", "");
	

	/* 建立 属性类型 和 属性 的关联关系 */
	public static List<PropertyType> getAllPropertyTypes() {
		List<PropertyType> ret = new ArrayList<PropertyType>();
		
		List<Property> MESSAGE_PUSHTYPEList = new ArrayList<Property>();
		MESSAGE_PUSHTYPEList.add(PROP_MESSAGE_PUSHTYPE_UNKNOW_);
		MESSAGE_PUSHTYPEList.add(PROP_MESSAGE_PUSHTYPE_APP_IOS_OR_ANDROID);
		MESSAGE_PUSHTYPEList.add(PROP_MESSAGE_PUSHTYPE_PUSH_ALL_ANDROID);
		MESSAGE_PUSHTYPEList.add(PROP_MESSAGE_PUSHTYPE_PUSH_ALL_IOS);
		MESSAGE_PUSHTYPEList.add(PROP_MESSAGE_PUSHTYPE_PUSH_ALL_APP);
		PROP_TYPE_MESSAGE_PUSHTYPE.setProperties(MESSAGE_PUSHTYPEList);
		
		List<Property> PRODUCT_STATUSList = new ArrayList<Property>();
		PRODUCT_STATUSList.add(PROP_PRODUCT_STATUS_UNKNOW_);
		PRODUCT_STATUSList.add(PROP_PRODUCT_STATUS_PRODUCT_WAIT_FOR_AUTO);
		PRODUCT_STATUSList.add(PROP_PRODUCT_STATUS_PRODUCT_AUTO_SUCCESS);
		PRODUCT_STATUSList.add(PROP_PRODUCT_STATUS_PRODUCT_AUTO_FAILD);
		PRODUCT_STATUSList.add(PROP_PRODUCT_STATUS_PRODUCT_OFF_SHELF);
		PROP_TYPE_PRODUCT_STATUS.setProperties(PRODUCT_STATUSList);
		
		List<Property> ORDER_PAYMENT_TYPEList = new ArrayList<Property>();
		ORDER_PAYMENT_TYPEList.add(PROP_ORDER_PAYMENT_TYPE_DEFAULT);
		ORDER_PAYMENT_TYPEList.add(PROP_ORDER_PAYMENT_TYPE_ALI_PAY);
		ORDER_PAYMENT_TYPEList.add(PROP_ORDER_PAYMENT_TYPE_ALI_WAP_PAY);
		ORDER_PAYMENT_TYPEList.add(PROP_ORDER_PAYMENT_TYPE_ALI_APP_PAY);
		PROP_TYPE_ORDER_PAYMENT_TYPE.setProperties(ORDER_PAYMENT_TYPEList);
		
		List<Property> ORDER_PAY_STATUSList = new ArrayList<Property>();
		ORDER_PAY_STATUSList.add(PROP_ORDER_PAY_STATUS_DEFAULT);
		ORDER_PAY_STATUSList.add(PROP_ORDER_PAY_STATUS_PAY_CREATER);
		ORDER_PAY_STATUSList.add(PROP_ORDER_PAY_STATUS_PAY_SUCCESSFUL);
		ORDER_PAY_STATUSList.add(PROP_ORDER_PAY_STATUS_PAY_FAILED);
		PROP_TYPE_ORDER_PAY_STATUS.setProperties(ORDER_PAY_STATUSList);
		
		List<Property> ORDER_ERROR_STATUSList = new ArrayList<Property>();
		ORDER_ERROR_STATUSList.add(PROP_ORDER_ERROR_STATUS_DEFAULT);
		ORDER_ERROR_STATUSList.add(PROP_ORDER_ERROR_STATUS_SOLVE_SUCCESSFUL);
		ORDER_ERROR_STATUSList.add(PROP_ORDER_ERROR_STATUS_SOLVE_FAILED);
		PROP_TYPE_ORDER_ERROR_STATUS.setProperties(ORDER_ERROR_STATUSList);
		
		
		ret.add(PROP_TYPE_MESSAGE_PUSHTYPE);
		ret.add(PROP_TYPE_PRODUCT_STATUS);
		ret.add(PROP_TYPE_ORDER_PAYMENT_TYPE);
		ret.add(PROP_TYPE_ORDER_PAY_STATUS);
		ret.add(PROP_TYPE_ORDER_ERROR_STATUS);
		
		return ret;
	}

}



