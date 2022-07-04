package com.arham.mocktask2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private int age;
    private String profession;
    private String maritalStatus;
    private String bankName;
    private long accountNumber;
    private String creditCardStatus;
}
