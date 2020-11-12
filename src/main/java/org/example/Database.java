package org.example;

import javax.xml.crypto.Data;

public class Database {

    private static Database instance;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        System.out.println("CONSTRUCTOR DATABASE");
    }

    private boolean opened = false;

    public void open() {
        System.out.println("Database");
        opened = true;
    }
}
