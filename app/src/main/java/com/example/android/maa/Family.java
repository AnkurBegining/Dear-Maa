package com.example.android.maa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener mMediaResource =new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaResource();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Words> word=new ArrayList<Words>();

        word.add(new Words("father","पिता",R.drawable.family_father,R.raw.family_father));
        word.add(new Words("mother","माँ",R.drawable.family_mother,R.raw.family_mother));
        word.add(new Words("son","बेटा",R.drawable.family_son,R.raw.family_son));
        word.add(new Words("daughter","बेटी",R.drawable.family_daughter,R.raw.family_daughter));
        word.add(new Words("older brother","बड़ा भाई",R.drawable.family_older_brother,R.raw.family_older_brother));
        word.add(new Words("younger brother","छोटा भाई",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        word.add(new Words("older sister","बड़ी बहन",R.drawable.family_older_sister,R.raw.family_older_sister));
        word.add(new Words("younger sister","छोटी बहन",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        word.add(new Words("grandmother","दादी ",R.drawable.family_grandmother,R.raw.family_grandmother));
        word.add(new Words("grandfather","दादा",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter adapter=new WordAdapter(Family.this , word ,R.color.category_family);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words w=word.get(position);
                releaseMediaResource();
                mediaPlayer=MediaPlayer.create(Family.this,w.getmAudioResourceId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mMediaResource);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void releaseMediaResource(){
        if(mediaPlayer !=null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}
