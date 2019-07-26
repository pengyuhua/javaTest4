package com.hand.pyh.bean;

public class Page {

    private int pageSize;               //分页大小
    private int page;                   //页数
    private String sort = "ASC";        //排序方式

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
