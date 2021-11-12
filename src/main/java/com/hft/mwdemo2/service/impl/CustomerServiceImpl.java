package com.hft.mwdemo2.service.impl;

import com.hft.mwdemo2.entity.Customer;
import com.hft.mwdemo2.model.AddCustomerRequest;
import com.hft.mwdemo2.repository.CustomerRepository;
import com.hft.mwdemo2.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> getUsersByName(String name) {
        return customerRepository.findUserByName(name);
    }

    @Override
    public Customer addUser(AddCustomerRequest addCustomerRequest) {
        Customer newCustomer = new Customer();
        newCustomer.setName(addCustomerRequest.getName());
        newCustomer.setAge(addCustomerRequest.getAge());
        return customerRepository.save(newCustomer);
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }
}
