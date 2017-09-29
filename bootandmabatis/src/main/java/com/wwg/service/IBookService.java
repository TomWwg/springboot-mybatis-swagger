package com.wwg.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.wwg.entity.TeachBook;

import java.util.List;

/**
 * Created by wwg on 2017/9/19.
 */
public interface IBookService {

    /**
     * 分页查询
     * @param page
     * @return
     */
    PageInfo<TeachBook> findAll(Page page);

    /**
     * 批量插入
     * @param books
     * @return
     */
    String upsertBatch(List<TeachBook> books);
}
