package com.k7.logic;

import com.k7.dao.ContactNamesDao;
import com.k7.dao.PhoneDao;
import com.k7.entities.ContactName;
import com.k7.entities.Phone;
import lombok.AllArgsConstructor;

import java.util.Iterator;

@AllArgsConstructor
public class ByPhoneDeleteContact implements DeleteContact {
    private ContactNamesDao names;
    private PhoneDao phones;

    @Override
    public int deleteContact(String name) {
        int flag = 0;
        ContactName temp = new ContactName("");
        for (ContactName c : names.getAll()
        ) {
            if (c.getName().equals(name)) flag = 1;
        }
        if (flag == 0) System.out.println("Contact not found");
        else {
            for (ContactName n : names.getAll()
            ) {
                if (n.getName().equals(name))
                    temp = n;
            }
            names.del(temp);
        }
        return flag;
    }

    @Override
    public void deletePhone(String phone) {
        Iterator<Phone> iter = phones.getAllPhones().iterator();
        while (iter.hasNext()) {
            Phone p = iter.next();
            if (p.getPhoneNumber().equals(phone))
                iter.remove();
        }
        System.out.println("Contact deleted");
    }
}
