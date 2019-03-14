package com.hello.dao;

import com.hello.model.Customer;
import com.hello.model.Employee;
import com.hello.model.User;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */
public interface ICustomerDao {
    User selectCustomer(long customerId);

    void deleteCustomerById(long customerId);

    void deleteCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void insertCustomer(Customer customer)

}
