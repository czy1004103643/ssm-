package com.hello.service.impl;

import com.hello.dao.ICustomerDao;
import com.hello.dao.IUserDao;
import com.hello.model.Customer;
import com.hello.model.Employee;
import com.hello.model.User;
import com.hello.service.ICustomerService;
import com.hello.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

@Service("userService")
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private ICustomerDao customerDao;

    @Override
    public User selectCustomer(long customerId) {
        return customerDao.selectCustomer(customerId);
    }

    @Override
    public void deleteCustomerById(long customerId) {
        customerDao.deleteCustomerById(customerId);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerDao.deleteCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public int insertCustomer(Customer customer) {
        return customerDao.insertCustomer(customer);
    }
}
