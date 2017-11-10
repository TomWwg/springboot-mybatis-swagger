package com.wwg.dao;

import com.wwg.entity.Step;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface StepDAO {
    int deleteByPrimaryKey(Long stepId);

    void insert(Step record);

    void insertSelective(Step record);

    void insertBatch(List<Step> records);

    Step selectByPrimaryKey(Long stepId);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);
}