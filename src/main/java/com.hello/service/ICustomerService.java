package com.hello.service;

import com.hello.model.Customer;
import com.hello.model.Employee;
import com.hello.model.User;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

public interface ICustomerService {
    public User selectCustomer(long customerId);

    public void deleteCustomerById(long customerId);

    public void deleteCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public int insertCustomer(Customer customer);
}
