package com.example.android.maa;

/**
 * Created by Lenovo on 11-02-2017.
 */

public class Words {

    private String mHindiTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Words(String hindiTranslation, String englishTranslation ,int audioResourceId){
        mEnglishTranslation=englishTranslation;
        mHindiTranslation=hindiTranslation;
        mAudioResourceId=audioResourceId;
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

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
