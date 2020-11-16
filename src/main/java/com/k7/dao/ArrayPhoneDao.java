package com.k7.dao;

import com.k7.entities.ContactName;
import com.k7.entities.Phone;

import java.util.ArrayList;
import java.util.List;

public class ArrayPhoneDao implements PhoneDao {
    List<Phone> phones = new ArrayList<>();

    @Override
    public void addPhonesInArray() {
        phones.add(new Phone("Vasya", "+380674568799", "mobile"));
        phones.add(new Phone("Petia", "0672354711", "mobile"));
        phones.add(new Phone("Alex", "0674455666", "mobile"));
        phones.add(new Phone("Alex", "7754611", "fax"));
        phones.add(new Phone("Alex", "7754971", "home"));
        phones.add(new Phone("Max", "+380748768111", "mobile"));
        phones.add(new Phone("Leo", "6548899", "home"));
        phones.add(new Phone("Vova", "6548123213", "home"));
        phones.add(new Phone("Valya", "6548123213", "mobile"));


    }

    @Override
    public List<Phone> getAllPhones() {
        return phones;
    }

    @Override
    public void addPhones(String contactName, String phone, String phoneType) {
        phones.add(new Phone(contactName, phone, phoneType));
    }

    @Override
    public void delPhones(Phone phone) {
        phones.remove(phone);

    }
}
