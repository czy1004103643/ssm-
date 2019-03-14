package com.hello.service;

import com.hello.model.Employee;
import com.hello.model.User;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

public interface IEmployeeService {
    public Employee selectEmployee(long customerId);

    public void deleteEmployeeById(long customerId);

    public void deleteEmployee(Employee customer);

    public int updateEmployee(Employee customer);

    public int insertEmployee(Employee customer);
}
