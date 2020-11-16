package com.k7.logic;

import com.k7.entities.ContactName;
import com.k7.entities.Phone;
import com.k7.entities.PhoneType;

import java.util.List;
import java.util.Set;

public interface ContatsViewer {
    void viewContact (Set<ContactName> contact, List<Phone> phones, List<PhoneType> phoneTypes);
}
