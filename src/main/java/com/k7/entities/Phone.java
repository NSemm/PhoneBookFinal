package com.k7.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
    private String contactName;
    private String phoneNumber;
    private String phoneType;
}
