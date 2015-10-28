package com.xam.yjs.dao.dao;

import java.util.List;

import com.xam.yjs.dao.model.PaymentDiscountDo;
import com.xam.yjs.core.base.BaseDao;

/** 
 * 注意：本类的基本操作，包括如下5个方法，为自动生成
 * 用户可以根据需要添加额外功能
 */
 
public interface PaymentDiscountDao extends BaseDao {

	PaymentDiscountDo findByPKey(String id);

	int getTotalPage();
	int insert(PaymentDiscountDo PaymentDiscount);

	int update(PaymentDiscountDo PaymentDiscount);

	int delete(PaymentDiscountDo PaymentDiscount);
	List<PaymentDiscountDo> getList();
	

}


