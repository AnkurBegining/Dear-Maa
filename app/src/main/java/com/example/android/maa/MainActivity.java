package com.example.android.maa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number=(TextView)findViewById(R.id.number_text_view);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Numbers.class);
                startActivity(intent);
            }
        });

        TextView family =(TextView)findViewById(R.id.family_text_view);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent =new Intent(MainActivity.this,Family.class);
                startActivity(familyIntent);
            }
        });

        TextView colors=(TextView)findViewById(R.id.colors_text_view);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorIntent = new Intent(MainActivity.this, Colors.class);
                startActivity(colorIntent);
            }
        });

        TextView phrases=(TextView)findViewById(R.id.phrases_text_view);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent =new Intent(MainActivity.this,Phrases.class);
                startActivity(phrasesIntent);
            }
        });

    }
}
