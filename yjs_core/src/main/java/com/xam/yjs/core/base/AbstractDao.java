package com.xam.yjs.core.base;

public interface AbstractDao {
	public int insert(BaseDo bo);
	public int update(BaseDo bo);
	public int delete(BaseDo bo);

}
