package com.k7.logic;

import com.k7.entities.ContactName;

import java.util.Set;

public interface ContactsFinder {
    Set<ContactName> searchContact(String text);
}
