package com.xam.yjs.dao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xam.yjs.dao.model.UserAccountDo;
import com.xam.yjs.core.base.BaseDao;

/** 
 * 注意：本类的基本操作，包括如下5个方法，为自动生成
 * 用户可以根据需要添加额外功能
 */
 
public interface UserAccountDao extends BaseDao {

	UserAccountDo findByPKey(int id);

	int getTotalPage();
	int insert(UserAccountDo UserAccount);

	int update(UserAccountDo UserAccount);

	int delete(UserAccountDo UserAccount);
	List<UserAccountDo> getList();

	UserAccountDo findUserAccountByUsername(@Param("username")String username);
	

}


