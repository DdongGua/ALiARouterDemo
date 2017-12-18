package com.example.aliarouterdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 亮亮 on 2017/12/18.
 */

public class InfoBean implements Parcelable{
   String name;
   int age;

    public InfoBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected InfoBean(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<InfoBean> CREATOR = new Creator<InfoBean>() {
        @Override
        public InfoBean createFromParcel(Parcel in) {
            return new InfoBean(in);
        }

        @Override
        public InfoBean[] newArray(int size) {
            return new InfoBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
}
