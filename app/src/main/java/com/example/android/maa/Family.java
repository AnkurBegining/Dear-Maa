package com.example.android.maa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Words> word=new ArrayList<Words>();

        word.add(new Words("father","पिता",R.drawable.family_father));
        word.add(new Words("mother","माँ",R.drawable.family_mother));
        word.add(new Words("son","बेटा",R.drawable.family_son));
        word.add(new Words("daughter","बेटी",R.drawable.family_daughter));
        word.add(new Words("older brother","बड़ा भाई",R.drawable.family_older_brother));
        word.add(new Words("younger brother","छोटा भाई",R.drawable.family_younger_brother));
        word.add(new Words("older sister","बड़ी बहन",R.drawable.family_older_sister));
        word.add(new Words("younger sister","छोटी बहन",R.drawable.family_younger_sister));
        word.add(new Words("grandmother","दादी ",R.drawable.family_grandmother));
        word.add(new Words("grandfather","दादा",R.drawable.family_grandfather));

        WordAdapter adapter=new WordAdapter(Family.this , word ,R.color.category_family);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
