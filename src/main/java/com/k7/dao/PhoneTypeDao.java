package com.k7.dao;

import com.k7.entities.PhoneType;

import java.util.ArrayList;
import java.util.List;

public interface PhoneTypeDao {
    void addTypeInArray();

    List<PhoneType> getAllTypes();
}
