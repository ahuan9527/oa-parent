package com.ahuan.oa.organ.mapper;

import com.ahuan.oa.organ.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface EmployeeMapper {

    void add(Employee employee);
}
