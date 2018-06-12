package com.example.android.miwok;

public class Word {
    private String mMiwoktranslation;
    private String mDefaulttranslation;

    public Word(String miwoktranslation, String defaulttranslation) {
        mMiwoktranslation = miwoktranslation;
        mDefaulttranslation = defaulttranslation;
    }

    public String getmiwoktranslation() {
        return mMiwoktranslation;
    }

    public String getdefaulttranslation() {
        return mDefaulttranslation;
    }
}
