package com.example.android.maa;

/**
 * Created by Lenovo on 11-02-2017.
 */

public class Words {

    private String mHindiTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId;

    public Words(String hindiTranslation, String englishTranslation ,int imageResourceID){
        mEnglishTranslation=englishTranslation;
        mHindiTranslation=hindiTranslation;
        mImageResourceId=imageResourceID;

    }

    public String getmHindiTranslation(){
        return mHindiTranslation;
    }

    public  String getmEnglishTranslation(){
        return  mEnglishTranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
}
