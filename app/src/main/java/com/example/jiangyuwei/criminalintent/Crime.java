package com.example.jiangyuwei.criminalintent;

import java.util.Date;
import java.util.StringTokenizer;
import java.util.UUID;

/**
 * Created by jiangyuwei on 16/4/3.
 */
public class Crime {
    private UUID mId;
    private String title;
    private Date mDate;
    private boolean mSolved;
    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    @Override
    public String toString(){
        return  title;
    }
}
