package com.thuyan.example;

public class ListString {
    // Store the Strings
    private String String1;
    private String String2;
    private String String3;
    private String String4;
    private String String5;
    private String String6;
    private String String7;
    private String String8;
    // Store the id of the  image
    private int mImageDrawable1;
    private int mImageDrawable2;

    //Contructor
        public ListString(String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, int mImageDrawable1, int mImageDrawable2) {
        String1 = string1;
        String2 = string2;
        String3 = string3;
        String4 = string4;
        String5 = string5;
        String6 = string6;
        String7 = string7;
        String8 = string8;
        this.mImageDrawable1 = mImageDrawable1;
        this.mImageDrawable2 = mImageDrawable2;
    }

    public String getString1() {
        return String1;
    }

    public void setString1(String string1) {
        String1 = string1;
    }

    public String getString2() {
        return String2;
    }

    public void setString2(String string2) {
        String2 = string2;
    }

    public String getString3() {
        return String3;
    }

    public void setString3(String string3) {
        String3 = string3;
    }

    public String getString4() {
        return String4;
    }

    public void setString4(String string4) {
        String4 = string4;
    }

    public String getString5() {
        return String5;
    }

    public void setString5(String string5) {
        String5 = string5;
    }

    public String getString6() {
        return String6;
    }

    public void setString6(String string6) {
        String6 = string6;
    }

    public String getString7() {
        return String7;
    }

    public void setString7(String string7) {
        String7 = string7;
    }

    public String getString8() {
        return String8;
    }

    public void setString8(String string8) {
        String8 = string8;
    }


    public int getmImageDrawable1() {
        return mImageDrawable1;
    }

    public void setmImageDrawable1(int mImageDrawable1) {
        this.mImageDrawable1 = mImageDrawable1;
    }

    public int getmImageDrawable2() {
        return mImageDrawable2;
    }

    public void setmImageDrawable2(int mImageDrawable2) {
        this.mImageDrawable2 = mImageDrawable2;
    }
}
