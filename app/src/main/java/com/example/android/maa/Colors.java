package com.example.android.maa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Words> words =new ArrayList<Words>();

        words.add(new Words("red","लाल",R.drawable.color_red ,R.raw.color_red));
        words.add(new Words("yellow","पीला",R.drawable.color_mustard_yellow,R.raw.color_yellow));
        words.add(new Words("green","हरा",R.drawable.color_green,R.raw.color_green));
        words.add(new Words("brown", "भूरा",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Words("gray","भूरा",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Words("black","काला",R.drawable.color_black,R.raw.color_black));
        words.add(new Words("white","सफेद",R.drawable.color_white,R.raw.color_white));

        WordAdapter adapter=new WordAdapter(Colors.this ,words ,R.color.category_colors);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words w=words.get(position);
                mediaPlayer=MediaPlayer.create(Colors.this,w.getmAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
