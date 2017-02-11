package com.example.android.maa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Words> words =new ArrayList<Words>();

        words.add(new Words("एक","one",R.drawable.number_one,R.raw.number_one));
        words.add(new Words("दो","two",R.drawable.number_two,R.raw.number_two));
        words.add(new Words("तीन","three",R.drawable.number_three,R.raw.number_three));
        words.add(new Words("चार","four",R.drawable.number_four,R.raw.number_four));
        words.add(new Words("पांच","five",R.drawable.number_five,R.raw.number_five));
        words.add(new Words("छः","six",R.drawable.number_six,R.raw.number_six));
        words.add(new Words("सात","seven",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Words("आठ","eight",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Words("नौ ","nine",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Words("दस","ten",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter adapter=new WordAdapter(Numbers.this ,words ,R.color.category_numbers);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words w=words.get(position);
                mediaPlayer=MediaPlayer.create(Numbers.this, w.getmAudioResourceId());
                mediaPlayer.start();

            }
        });

    }


}
