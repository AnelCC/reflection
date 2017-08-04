package com.anelcc.algorithms;

public class TimeConversion {

    static String timeConversion(String s) {
        String[] time = s.split(":");
        String hour = time[0];
        String minutes = time[1];
        String secounds = time[2].substring(0,2);
        String meridiem = time[2].substring(2,4);
        String newTimeString = "";

        if (meridiem.equalsIgnoreCase("AM")){
            if(hour.equals("12")) {
                newTimeString = "00"+":"+minutes+":"+secounds;
            }else{
                newTimeString = hour+":"+minutes+":"+secounds;
            }
        } else {
            if(!hour.equals("12")){
                int h = Integer.parseInt(hour);
                h = h +12;
                hour =""+h;
                newTimeString =  hour+":"+minutes+":"+secounds;
            } else {
                newTimeString = hour + ":" + minutes + ":" + secounds;
            }

        }
        return newTimeString;
    }



}
