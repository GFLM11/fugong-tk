package com.fugong.service;

import com.fugong.dto.EmployeeLoginDTO;
import com.fugong.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
