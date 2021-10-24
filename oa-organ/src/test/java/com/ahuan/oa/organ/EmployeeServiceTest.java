package com.ahuan.oa.organ;

import com.ahuan.oa.organ.model.Employee;
import com.ahuan.oa.organ.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:application-organ.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void  testEmployee(){
        Employee employee = new Employee();
        employee.setAge(12);
        employee.setName("李四");
        employeeService.add(employee);
    }
}
