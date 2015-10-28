package com.xam.yjs.dao.dao;

import java.util.List;

import com.xam.yjs.dao.model.CollectUserBuildModDo;
import com.xam.yjs.core.base.BaseDao;

/** 
 * 注意：本类的基本操作，包括如下5个方法，为自动生成
 * 用户可以根据需要添加额外功能
 */
 
public interface CollectUserBuildModDao extends BaseDao {

	CollectUserBuildModDo findByPKey(String id);

	int getTotalPage();
	int insert(CollectUserBuildModDo CollectUserBuildMod);

	int update(CollectUserBuildModDo CollectUserBuildMod);

	int delete(CollectUserBuildModDo CollectUserBuildMod);
	List<CollectUserBuildModDo> getList();
	

}


