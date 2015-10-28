package com.xam.yjs.core.base;

import java.util.List;

public interface BaseDao {
	int insert(BaseDo baseDo);

	int update(BaseDo baseDo);

	int delete(BaseDo baseDo);
	
	BaseDo findByPKey(BaseDo baseDo);
	
	
}
