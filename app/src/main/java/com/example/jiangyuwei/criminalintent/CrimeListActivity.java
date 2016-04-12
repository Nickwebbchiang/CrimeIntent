package com.example.jiangyuwei.criminalintent;

import android.app.Activity;
import android.app.Fragment;

/**
 * Created by jiangyuwei on 16/4/6.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment(){
        return new CrimeListFragment();
    }

}
