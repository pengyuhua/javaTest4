package com.hand.pyh.service.serviceImpl;

import com.hand.pyh.bean.Customer;
import com.hand.pyh.dao.CustomerMapper;
import com.hand.pyh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public boolean queryCustomer(Customer customer) {
        List<Customer> customers = customerMapper.queryCustomer(customer);

        return customers.isEmpty() ? false: true ;
    }

    @Override
    public Customer insertCustomer(Customer customer) {
        int insertResult = customerMapper.insertCustomer(customer);
        if(insertResult >= 0 ){
            return customer;
        }else {
            return new Customer(-1);
        }
    }

    @Override
    public boolean updateCustomerSelective(Customer customer) {
        return customerMapper.updateCustomerSelective(customer) >= 0 ? true: false;
    }

    @Override
    public boolean deleteCustomer(int customer_id) {
        return customerMapper.deleteCustomer(customer_id) >= 0 ? true: false;
    }
}
