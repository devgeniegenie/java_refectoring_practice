package com.HideDelegate.before;

import java.util.Enumeration;

public class AddressFile {
    private final Database _database;
    public AddressFile(String filename) {
        _database = new Database(filename);
    }

    public Database getDatabase() {
        return _database;
    }

    public Enumeration names() {
        return _database.getProperties().propertyNames();
    }
}
