package com.xam.yjs.core.base;

public class BaseCriteria extends BaseBean
{
    // protected int pageOffset;
    protected int pageSize;

    protected int pageNum;

    public int getPageSize()
    {
        if (pageSize == 0)
        {
            return 10;
        }
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getPageOffset()
    {
        return (pageNum - 1) * this.getPageSize();
    }

    // public void setPageOffset(int pageOffset) {
    // this.pageOffset = pageOffset;
    // }
    public int getPageNum()
    {
        if (pageNum == 0)
        {
            return 1;
        }
        return pageNum;
    }

    public void setPageNum(int pageNum)
    {
        this.pageNum = pageNum;
    }
}
