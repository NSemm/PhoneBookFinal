package com.k7.dz_fynally;

import com.k7.dao.ArrayContactNamesDao;
import com.k7.entities.ContactName;
import com.k7.logic.NameContactsFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class NameContactFinderTest {
    NameContactsFinder findNames;
    ArrayContactNamesDao contactsNames;

    @BeforeEach
    public void init() {
        contactsNames = new ArrayContactNamesDao();
        findNames = new NameContactsFinder(contactsNames.getAll());
    }

    @Test
    void findContactTest() {
        Set<ContactName> exp = new HashSet<>();
        String name = "Max";
        exp.add(new ContactName("name"));
        findNames.searchContact(name);
        Assertions.assertNotNull(findNames.searchContact(name));
        Assertions.assertEquals(exp,findNames.searchContact(name));
    }


    @Test
    void findContactNegativeTest() {
        Set<ContactName> exp = new HashSet<>();
        String name = "lkjasdlkamsldkmaslkm";
        //exp.add(new ContactName(""));
        findNames.searchContact(name);
        //Assertions.assertNull(findNames.searchContact(name));
        Assertions.assertEquals(exp,findNames.searchContact(name));
    }


}

