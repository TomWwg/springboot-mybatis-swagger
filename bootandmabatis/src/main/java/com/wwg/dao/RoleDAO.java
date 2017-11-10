package com.wwg.dao;

import com.wwg.entity.Role;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface RoleDAO {
    int deleteByPrimaryKey(Long roleId);

    void insert(Role record);

    void insertSelective(Role record);

    void insertBatch(List<Role> records);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}