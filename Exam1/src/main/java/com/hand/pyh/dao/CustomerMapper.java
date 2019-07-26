package com.hand.pyh.dao;

import com.hand.pyh.bean.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {

    List<Customer> queryCustomer(Customer customer);

    int insertCustomer(Customer customer);

    int updateCustomerSelective(Customer customer);

    int deleteCustomer(int customer_id);
}
