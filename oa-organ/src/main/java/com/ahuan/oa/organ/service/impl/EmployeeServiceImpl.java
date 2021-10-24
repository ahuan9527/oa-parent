package com.ahuan.oa.organ.service.impl;

import com.ahuan.oa.organ.mapper.EmployeeMapper;
import com.ahuan.oa.organ.model.Employee;
import com.ahuan.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public void add(Employee employee) {
        employeeMapper.add(employee);
    }
}
