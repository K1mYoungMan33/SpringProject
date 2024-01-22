package com.yi.spring.p33.mappers;

import com.yi.spring.p33.vo.Employee;
import com.yi.spring.p33.vo.EmployeeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> listEmployees();
}
