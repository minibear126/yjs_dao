package com.xam.yjs.dao.dao;

import java.util.List;

import com.xam.yjs.dao.model.SubscribeUserToDeveloperDo;
import com.xam.yjs.core.base.BaseDao;

/** 
 * 注意：本类的基本操作，包括如下5个方法，为自动生成
 * 用户可以根据需要添加额外功能
 */
 
public interface SubscribeUserToDeveloperDao extends BaseDao {

	SubscribeUserToDeveloperDo findByPKey(String id);

	int getTotalPage();
	int insert(SubscribeUserToDeveloperDo SubscribeUserToDeveloper);

	int update(SubscribeUserToDeveloperDo SubscribeUserToDeveloper);

	int delete(SubscribeUserToDeveloperDo SubscribeUserToDeveloper);
	List<SubscribeUserToDeveloperDo> getList();
	

}


