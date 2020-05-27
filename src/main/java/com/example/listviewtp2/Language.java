package com.example.listviewtp2;

import android.widget.ListAdapter;

import java.util.List;

public class Language{

    private String name;
    private String date;
    private String icon;

    public Language(String name, String date, String icon) {
        this.name = name;
        this.date = date;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getIcon() {
        return icon;
    }
}
