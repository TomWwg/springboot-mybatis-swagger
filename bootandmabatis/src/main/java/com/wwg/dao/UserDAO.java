package com.wwg.dao;

import com.wwg.entity.User;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface UserDAO {
    int deleteByPrimaryKey(Long userId);

    void insert(User record);

    void insertSelective(User record);

    void insertBatch(List<User> records);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}