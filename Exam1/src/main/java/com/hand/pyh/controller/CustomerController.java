package com.hand.pyh.controller;


import com.hand.pyh.bean.Customer;
import com.hand.pyh.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("v1/customers")
public class CustomerController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public String createCustomer(Customer customer){
        customer.setCreate_date(new Date());
        logger.warn(customer.toString());
        Customer customer1 = customerService.insertCustomer(customer);
        logger.warn(customer1.toString());
        return customer1.getCustomer_id() != -1 ? "{\"createStatus\": true, \"newID\": "+customer1.getCustomer_id()+" }": "{\"createStatus\": false}";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateCustomer(Customer customer){
        return customerService.updateCustomerSelective(customer) ? "{\"updateStatus\": true}" : "{\"updateStatus\": false}";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String updateCustomer(int id){
        return customerService.deleteCustomer(id) ? "{\"deleteStatus\": true}" : "{\"deleteStatus\": false}";
    }
}
