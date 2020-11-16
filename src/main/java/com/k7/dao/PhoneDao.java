package com.k7.dao;

import com.k7.entities.Phone;

import java.util.List;

public interface PhoneDao {
    void addPhonesInArray();
    List<Phone> getAllPhones();
    void addPhones (String contactName, String phone, String phoneType);
    void delPhones (Phone phone);

}
