package com.wwg.dao;

import com.wwg.entity.TeachBook;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface TeachBookDAO {
    int deleteByPrimaryKey(Integer bookId);

    void insert(TeachBook record);

    void insertSelective(TeachBook record);

    void insertBatch(List<TeachBook> records);

    TeachBook selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(TeachBook record);

    int updateByPrimaryKey(TeachBook record);

    List<TeachBook> findAll();

    void upsertBatch(List<TeachBook> books);
}