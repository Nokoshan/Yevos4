package com.example.vgagnon.yevos;

import java.util.ArrayList;

public class Contact {
    private String mName;
    private boolean mOnline;
    private String mSerie;

    public Contact(String name, boolean online) {
        mName = name;
        mOnline = online;

    }

    public String getName() {
        return mName;
    }

    public String getSerie(){
        return mSerie;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<>();

        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact("Person " + ++lastContactId, i <= numContacts / 2));
        }

        return contacts;
    }
}
