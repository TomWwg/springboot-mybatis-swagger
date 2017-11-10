package com.wwg.dao;

import com.wwg.entity.Hospital;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface HospitalDAO {
    int deleteByPrimaryKey(Long hospitalId);

    void insert(Hospital record);

    void insertSelective(Hospital record);

    void insertBatch(List<Hospital> records);

    Hospital selectByPrimaryKey(Long hospitalId);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}