package com.hello.dao;

import com.hello.model.Employee;
import com.hello.model.User;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */
public interface IEmployeeDao {
    Employee selectEmployee(long customerId);

    void deleteEmployeeById(long customerId);

    void deleteEmployee(Employee customer);

    int updateEmployee(Employee customer);

    int insertEmployee(Employee customer);

}
