package com.hft.mwdemo2.service;


import com.hft.mwdemo2.entity.Customer;
import com.hft.mwdemo2.model.AddCustomerRequest;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllUsers();
    List<Customer> getUsersByName(String name);
    Customer addUser(AddCustomerRequest addCustomerRequest);
    String deleteUser(Long id);
}
