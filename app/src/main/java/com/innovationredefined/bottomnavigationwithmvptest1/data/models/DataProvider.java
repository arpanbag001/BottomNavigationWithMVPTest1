package com.innovationredefined.bottomnavigationwithmvptest1.data.models;

import com.innovationredefined.bottomnavigationwithmvptest1.data.Database;

public class DataProvider {
    public String getData(String key) {
        Database database = new Database();
        return database.getDataFromDatabase(key);
    }
}
