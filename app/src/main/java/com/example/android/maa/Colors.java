package com.example.android.maa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Words> words =new ArrayList<Words>();

        words.add(new Words("red","लाल",R.drawable.color_red));
        words.add(new Words("mustard yellow","पीला",R.drawable.color_mustard_yellow));
        words.add(new Words("green","हरा",R.drawable.color_green));
        words.add(new Words("brown", "भूरा",R.drawable.color_brown));
        words.add(new Words("gray","भूरा",R.drawable.color_gray));
        words.add(new Words("black","काला",R.drawable.color_black));
        words.add(new Words("white","सफेद",R.drawable.color_white));

        WordAdapter adapter=new WordAdapter(Colors.this ,words ,R.color.category_colors);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
