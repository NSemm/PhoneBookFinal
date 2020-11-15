package com.k7;

import com.k7.dao.ArrayContactNamesDao;
import com.k7.dao.ArrayPhoneDao;
import com.k7.dao.ArrayPhoneTypeDao;
import com.k7.entities.ContactName;
import com.k7.entities.Phone;
import com.k7.entities.PhoneType;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayPhoneTypeDao arr = new ArrayPhoneTypeDao();
        ArrayContactNamesDao names = new ArrayContactNamesDao();
        ArrayPhoneDao phones = new ArrayPhoneDao();
        //TestDaoContactName testDaoContactName = new TestDaoContactName(arr, names);
        //TestDaoContactName(arr, names);
        //--------------------------------------
        names.addInArray();
        for (
                ContactName n : names.getAll()
        ) {
            System.out.println(n);
        }
        System.out.println("--------------------------");
        names.add("test");

        for (ContactName n : names.getAll()
        ) {
            System.out.println(n);
        }
        System.out.println("--------------------------");
        ContactName temp = new ContactName("");
        for (ContactName n : names.getAll()
        ) {
            if (n.getName().equals("Leo"))
                temp = n;
        }
        names.del(temp);
        for (ContactName n : names.getAll()
        ) {
            System.out.println(n);
        }
        System.out.println("--------------------------");
        //--------------------------------------------------
        phones.addPhonesInArray();
        for (Phone p : phones.getAllPhones()
        ) {
            System.out.println(p);

        }
        System.out.println("----------------------------");
        phones.addPhones("Nick", "4755564", "fax");
        for (Phone p : phones.getAllPhones()
        ) {
            System.out.println(p);

        }
        System.out.println("----------------------------");
//        for (Phone p : phones.getAllPhones()
//        ) {
//            if (p.getPhoneNumber().equals("0674455666"))
//                phones.delPhones(p);
//        }
        Iterator<Phone> iter = phones.getAllPhones().iterator();
        while(iter.hasNext()){
            Phone p = iter.next();
            if (p.getPhoneNumber().equals("0674455666"))
                iter.remove();
        }

//        Phone tempPhone = new Phone("","","");
//        for (Phone p: phones.getAllPhones()
//        ) {
//            if (p.getPhoneNumber().equals("0674455666"))
//                tempPhone = p;
//
//            phones.delPhones(tempPhone);
//
//
//        }
        for (Phone p : phones.getAllPhones()
        ) {
            System.out.println(p);

        }
        System.out.println("----------------------------");


    }
}
