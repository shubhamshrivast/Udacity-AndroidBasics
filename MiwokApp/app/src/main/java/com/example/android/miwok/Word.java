package com.example.android.miwok;

public class Word {
    private String mMiwoktranslation;
    private String mDefaulttranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaulttranslation, String miwoktranslation, int imageresourceid) {
        mMiwoktranslation = miwoktranslation;
        mDefaulttranslation = defaulttranslation;
        mImageResourceId = imageresourceid;
    }

    public Word(String defaulttranslation, String miwoktranslation) {
        mMiwoktranslation = miwoktranslation;
        mDefaulttranslation = defaulttranslation;
    }


    public String getmiwoktranslation() {
        return mMiwoktranslation;
    }

    public String getdefaulttranslation() {
        return mDefaulttranslation;
    }

    public int getimageResoursceid() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
