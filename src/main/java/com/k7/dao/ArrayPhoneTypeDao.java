package com.k7.dao;

import com.k7.entities.PhoneType;

import java.util.ArrayList;
import java.util.List;

public class ArrayPhoneTypeDao implements PhoneTypeDao {
    List<PhoneType> phoneTypes = new ArrayList<>();

    @Override
    public void addTypeInArray() {
        phoneTypes.add(new PhoneType(1, "home"));
        phoneTypes.add(new PhoneType(2, "mobile"));
        phoneTypes.add(new PhoneType(3, "fax"));
    }

    @Override
    public List<PhoneType> getAllTypes() {
        return phoneTypes;
    }
}
