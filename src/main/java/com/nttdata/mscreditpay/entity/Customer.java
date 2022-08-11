package com.nttdata.mscreditpay.entity;

import lombok.Data;

@Data
public class Customer {


    private String id;


    private String name;


    private String lastName;


    private TypeCustomer typeCustomer;


    private String document;


    private Integer age;
}
