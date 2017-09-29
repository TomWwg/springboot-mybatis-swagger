package com.wwg.dto;

import com.github.pagehelper.Page;
import com.wwg.constant.Consts;

/**
 * Created by wwg on 2017/9/22.
 */
public class PageDto {
    private Integer pageNum;
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Page buildPage(Integer pageNum, Integer pageSize){
        return new Page(pageNum, pageSize);
    }

    public static Page buildPage(Integer pageNum){
        return new Page(pageNum, Consts.pageSize);
    }
}
