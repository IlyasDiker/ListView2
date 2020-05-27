package com.example.listviewtp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Language> languageList = new ArrayList<>();
        languageList.add(new Language("Phyton", "1991", "python"));
        languageList.add(new Language("C", "1970", "c"));
        languageList.add(new Language("Github", "2008", "github"));
        languageList.add(new Language("java", "1996", "java"));
        languageList.add(new Language("Switft", "1973", "swift"));
        languageList.add(new Language("php", "1994", "php"));
        languageList.add(new Language("Ruby", "1995", "ruby"));

        ListView listView = findViewById(R.id.LanguageListView);
        listView.setAdapter(new LanguageAdapter( this, languageList));

    }



}
