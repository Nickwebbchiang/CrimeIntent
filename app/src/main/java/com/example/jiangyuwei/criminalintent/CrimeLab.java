package com.example.jiangyuwei.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by jiangyuwei on 16/4/6.
 */
public class CrimeLab  {
    private ArrayList<Crime> mCrimes;
    private static volatile CrimeLab sCrimeLab;
    private Context mAppContext;
    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<>();
        for (int i=0;i<60;i++){
            Crime c = new Crime();
            c.setTitle("Crime #"+i);
            c.setmSolved(i%2==0);
            mCrimes.add(c);
        }
    }
    public static CrimeLab get(Context c){
        if (sCrimeLab ==null ){
            synchronized (CrimeListFragment.class){
                if (sCrimeLab==null){
                    sCrimeLab = new CrimeLab(c.getApplicationContext());
                }
            }
        }
        return sCrimeLab;
    }
    public ArrayList<Crime> getmCrimes(){
        return mCrimes;
    }
    public Crime getCrime(UUID id){
        for (Crime c:mCrimes){
            if (c.getmId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
