package com.xam.yjs.dao.model;

import com.xam.yjs.core.base.BaseDo;

/** 
 * 注意：本代码为自动生成，请勿手工修改！！！
 * 如果需要增减字段，或者修改字段类型，请修改entity-def.xml之后，用代码生成器重新生成！ 
 */
 
public class PaymentDiscountDo extends BaseDo {

	/** id */
	String id;
	/** 经销商id */
	int agencyId;
	/** 结算方式 */
	int paymentId;
	/** 折扣率 */
	double discount;

	
	public static final String OBJECTKEY ="ks:t_payment_discount";
	String CREATER;
	String LAST_USER;
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	public int getAgencyId() {
		return this.agencyId;
	}
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}
		
	public int getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
		
	public double getDiscount() {
		return this.discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
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


