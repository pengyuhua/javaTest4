package com.hand.pyh.controller;


import com.hand.pyh.bean.Customer;
import com.hand.pyh.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/customers")
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam("name")String name, @RequestParam("password")String password){
        logger.warn("name:" + name);
        logger.warn("password:" + password);

        return customerService.queryCustomer(new Customer(name, password)) ? "{\"loginStatus\": true}": "{\"loginStatus\": false}";
    }
}
