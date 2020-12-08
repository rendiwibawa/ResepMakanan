package com.rendi.resepmakanan;

import android.os.Parcel;
import android.os.Parcelable;

public class Resep implements  Parcelable {
    private String name;
    private String follower;
    private String pembaca;
    private String detail;
    private int photo;

    protected Resep(Parcel in) {
        follower = in.readString();
        pembaca = in.readString();
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public Resep() {

    }

    public static final Creator<Resep> CREATOR = new Creator<Resep>() {
        @Override
        public Resep createFromParcel(Parcel in) {
            return new Resep(in);
        }

        @Override
        public Resep[] newArray(int size) {
            return new Resep[size];
        }
    };

    public String getPembaca() {
        return pembaca;
    }

    public void setPembaca(String pembaca) {
        this.pembaca = pembaca;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(pembaca);
        dest.writeString(follower);
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}

