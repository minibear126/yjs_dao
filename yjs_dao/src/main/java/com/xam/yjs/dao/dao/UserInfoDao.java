package com.xam.yjs.dao.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xam.yjs.dao.model.UserInfoDo;
import com.xam.yjs.core.base.BaseDao;

/** 
 * 注意：本类的基本操作，包括如下5个方法，为自动生成
 * 用户可以根据需要添加额外功能
 */
 
public interface UserInfoDao extends BaseDao {

	UserInfoDo findByPKey(int id);

	int getTotalPage();
	int insert(UserInfoDo UserInfo);

	int update(UserInfoDo UserInfo);

	int delete(UserInfoDo UserInfo);
	List<UserInfoDo> getList();

	Map<String, Object> findUserInfoInMysqlByUserAccountId(@Param("accountId")int userAccountId);
	

}


