package com.example.listviewtp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class LanguageAdapter extends BaseAdapter {

    private Context context;
    private List<Language> languageList;
    private LayoutInflater inflater;

    public LanguageAdapter(Context context, List<Language> languageList) {
        this.context = context;
        this.languageList = languageList;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return languageList.size();
    }

    @Override
    public Language getItem(int position) {
        return languageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.row, null);

        Language currentItem = getItem(position);
        String Languagename = currentItem.getName();
        String Languagedate = currentItem.getDate();
        String icon = currentItem.getIcon();

        TextView texftfield = convertView.findViewById(R.id.name);
        texftfield.setText(Languagename);
        TextView datefield = convertView.findViewById(R.id.date);
        datefield.setText(Languagedate);
        ImageView iconview = convertView.findViewById(R.id.image);
        String resourcename = icon;
        int resID = context.getResources().getIdentifier(resourcename, "drawable", context.getPackageName());
        iconview.setImageResource(resID);


        return convertView;
    }
}


