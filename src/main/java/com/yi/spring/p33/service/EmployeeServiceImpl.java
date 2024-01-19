package com.yi.spring.p33.service;

import com.yi.spring.p33.mappers.EmployeeMapper;
import com.yi.spring.p33.vo.Employee;
import com.yi.spring.p33.vo.EmployeeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> listEmployees() {
        return employeeMapper.listEmployees();
    }
}
