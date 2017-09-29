package com.wwg.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.TeachBookDAO;
import com.wwg.entity.TeachBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/9/22.
 */
@Service("bookService")
public class BookServiceImpl implements IBookService {

    @Autowired
    private TeachBookDAO teachBookDAO;

    @Override
    public PageInfo<TeachBook> findAll(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<TeachBook> teachBooks = teachBookDAO.findAll();
        PageInfo<TeachBook> pageInfo = new PageInfo<>(teachBooks);
        return pageInfo;
    }

    @Override
    public String upsertBatch(List<TeachBook> books) {
        teachBookDAO.upsertBatch(books);
        return books.size()+"";
    }
}
