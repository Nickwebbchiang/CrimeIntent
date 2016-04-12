package com.example.jiangyuwei.criminalintent.utils;

import java.util.Date;

/**
 * Created by jiangyuwei on 16/4/6.
 */
public class DateFormate  {
    public static StringBuilder format(Date date){
        String data = date.toString();
        StringBuilder stringBuilder = new StringBuilder();
        String[] data1 = data.split(" ");
        switch (data1[0]){
            case "Mon":
                data1[0]="Monday";
                break;
            case "Tue":
                data1[0]="Tuesday";
                break;
            case "Wed":
                data1[0]="Wednesday";
                break;
            case "Thur":
                data1[0]="Thursday";
                break;
            case "Fri":
                data1[0]="Friday";
                break;
            case "Sun":
                data1[0]="Sunday";
                break;
            case "Sat":
                data1[0]="Saturday";
                break;
            default:
                break;

        }
        stringBuilder.append(data1[0]+",");
        stringBuilder.append(data1[1]+" ");
        stringBuilder.append(data1[2]+",");
        stringBuilder.append(data1[5]);
        return stringBuilder;
    }
}
