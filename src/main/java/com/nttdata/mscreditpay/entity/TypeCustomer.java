package com.nttdata.mscreditpay.entity;

import lombok.Data;

@Data
public class TypeCustomer {

    String id;

    EnumTypeCustomer value;

    public enum EnumTypeCustomer {
        EMPRESARIAL, PERSONAL
    }
}
