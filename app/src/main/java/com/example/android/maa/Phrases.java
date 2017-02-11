package com.example.android.maa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener mMediaResource=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releseMediaResource();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Words> words =new ArrayList<Words>();

        words.add(new Words("where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new Words("What is your name?","tinne oyaase' na", R.raw.phrases_what_is_your_name));
        words.add(new Words("My name is...","oyaaset.....", R.raw.phrases_my_name_is));
        words.add(new Words("How are you feeling?","michekses?", R.raw.phrases_how_r_feeling));
        words.add(new Words("I'm feeling good.","kuchi achit", R.raw.phrases_i_am));
        words.add(new Words("Are you coming?","eenes 'aa ", R.raw.phrases_are_you_coming));
        words.add(new Words("Yes i am coming.","haa' eenem", R.raw.phrases_i_am_coming));
        words.add(new Words("I'm coming.","eenem", R.raw.phrases_i_am_coming));
        words.add(new Words("Come here.","enni' nem", R.raw.phrases_come_here));

        WordAdapter adapter=new WordAdapter(Phrases.this,words,R.color.category_phrases);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words w=words.get(position);
                releseMediaResource();
                mediaPlayer=MediaPlayer.create(Phrases.this,w.getmAudioResourceId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mMediaResource);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releseMediaResource();
    }

    private void releseMediaResource(){
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}
