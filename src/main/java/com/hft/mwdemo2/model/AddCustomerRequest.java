package com.hft.mwdemo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerRequest implements Serializable {
    private String name;
    private Integer age;
}
