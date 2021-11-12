package com.hft.mwdemo2.controller;

import com.hft.mwdemo2.entity.Customer;
import com.hft.mwdemo2.model.AddCustomerRequest;
import com.hft.mwdemo2.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllUsers(){
        return customerService.getAllUsers();
    }

    @GetMapping("/customers/{name}")
    public List<Customer> getUsersByName(@PathVariable String name){
        return customerService.getUsersByName(name);
    }

    @PostMapping("/customers")
    public Customer addUser(@RequestBody AddCustomerRequest addCustomerRequest){
        return customerService.addUser(addCustomerRequest);
    }

}
