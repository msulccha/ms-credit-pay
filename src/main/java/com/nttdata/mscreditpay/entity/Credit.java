package com.nttdata.mscreditpay.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Credit {

    private String id;

    private CreditCard creditCard;

    private Double amount;

    private LocalDateTime date;
}
