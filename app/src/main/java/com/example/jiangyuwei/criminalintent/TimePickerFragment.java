package com.example.jiangyuwei.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jiangyuwei on 16/4/9.
 */
public class TimePickerFragment extends android.support.v4.app.DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_time,null);
        return new AlertDialog.Builder(getActivity()).setView(v).setTitle("Time of crime").setPositiveButton(android.R.string.ok,null).create();
    }
}
