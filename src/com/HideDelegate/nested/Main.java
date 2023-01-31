package com.HideDelegate.nested;

import java.io.IOException;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        try {
            AddressFile file = new AddressFile("address.txt");
            file.set("TEST 1", "test1@test.com");
            file.set("TEST 2", "test2@test.com");
            file.set("TEST 3", "test3@test.com");
            file.update();

            Enumeration e = file.names();
            while (e.hasMoreElements()) {
                String name = (String) e.nextElement();
                String mail = file.get(name);
                System.out.println("name: " + name + " mail: " + mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
