package com.example.jiangyuwei.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;

import java.util.Date;

/**
 * Created by jiangyuwei on 16/4/9.
 */
public class DialogTest extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Date date = (Date) getArguments().getSerializable("date");
        return new AlertDialog.Builder(getActivity()).setTitle("Take choice:").setPositiveButton("Date Picker", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                DatePickerFragment datePickerFragment = DatePickerFragment.getInstance(date);
                datePickerFragment.show(fm,"Date");
            }
        }).setNegativeButton("Time Picker", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                TimePickerFragment timePickerFragment = new TimePickerFragment();
                timePickerFragment.show(fm,"Time");
            }
        }).create();
    }
    public static DialogTest getInstance(Date date){
        Bundle args = new Bundle();
        args.putSerializable("date",date);
        DialogTest dialogTest = new DialogTest();
        dialogTest.setArguments(args);
        return dialogTest;
    }
}
