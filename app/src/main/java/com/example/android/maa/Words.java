package com.example.android.maa;

/**
 * Created by Lenovo on 11-02-2017.
 */

public class Words {

    private String mHindiTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Words(String hindiTranslation, String englishTranslation ,int imageResourceID){
        mEnglishTranslation=englishTranslation;
        mHindiTranslation=hindiTranslation;
        mImageResourceId=imageResourceID;
    }

    public Words(String hindiTranslation, String englishTranslation ,int imageResourceID, int audioResourceID){
        mEnglishTranslation=englishTranslation;
        mHindiTranslation=hindiTranslation;
        mImageResourceId=imageResourceID;
        mAudioResourceId= audioResourceID;

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

    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
