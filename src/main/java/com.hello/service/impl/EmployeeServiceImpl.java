package com.hello.service.impl;

import com.hello.dao.IEmployeeDao;
import com.hello.model.Employee;
import com.hello.service.IEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

@Service("userService")
public class EmployeeServiceImpl implements IEmployeeService {

    @Resource
    private IEmployeeDao customerDao;

    @Override
    public Employee selectEmployee(long customerId) {
        return customerDao.selectEmployee(customerId);
    }

    @Override
    public void deleteEmployeeById(long customerId) {
        customerDao.deleteEmployeeById(customerId);
    }

    @Override
    public void deleteEmployee(Employee customer) {
        customerDao.deleteEmployee(customer);
    }

    @Override
    public int updateEmployee(Employee customer) {
        return customerDao.updateEmployee(customer);
    }

    @Override
    public int insertEmployee(Employee customer) {
        return customerDao.insertEmployee(customer);
    }
}
