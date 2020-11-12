package org.example;

public class TestDb {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        db.open();
    }
}
