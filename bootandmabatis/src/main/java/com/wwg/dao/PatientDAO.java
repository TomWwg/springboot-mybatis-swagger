package com.wwg.dao;

import com.wwg.entity.Patient;

import java.util.List;

/**
 * Created by com.wwg.MybatisCodeGenerate on 2017-11-10
 */
public interface PatientDAO {
    int deleteByPrimaryKey(Long patientId);

    void insert(Patient record);

    void insertSelective(Patient record);

    void insertBatch(List<Patient> records);

    Patient selectByPrimaryKey(Long patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}