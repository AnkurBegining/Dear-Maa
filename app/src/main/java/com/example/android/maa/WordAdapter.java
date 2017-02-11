package com.example.android.maa;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 11-02-2017.
 */

public class WordAdapter extends ArrayAdapter {

    private  int mImageResourceId;

    public WordAdapter(Activity context, ArrayList<Words> arrayFlavor ,int imageResourceId) {
        super(context,0, arrayFlavor);
        mImageResourceId=imageResourceId;
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Words currentWord= (Words) getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.hindi_text_translation);
        nameTextView.setText(currentWord.getmHindiTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_text_translation);
        numberTextView.setText(currentWord.getmEnglishTranslation());

        ImageView iconImageView =(ImageView)listItemView.findViewById(R.id.imageIcon);
        if(currentWord.hasImage()){
            iconImageView.setImageResource(currentWord.getmImageResourceId());
            iconImageView.setVisibility(View.VISIBLE);

        }
        else{
            iconImageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mImageResourceId);
        textContainer.setBackgroundColor(color);

        return  listItemView;



    }


}
