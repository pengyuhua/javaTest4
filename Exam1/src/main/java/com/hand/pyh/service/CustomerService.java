package com.hand.pyh.service;

import com.hand.pyh.bean.Customer;

public interface CustomerService {

    boolean queryCustomer(Customer customer);

    Customer insertCustomer(Customer customer);

    boolean updateCustomerSelective(Customer customer);

    boolean deleteCustomer(int customer_id);
}
