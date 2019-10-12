package com.sanja;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(10,1));
        System.out.println(getDurationString(120));
    }

    public static String getDurationString(int minutes, int seconds){

        if((minutes < 0) || (seconds < 0)||!(seconds <= 59)){
            return "Invalid value";
        }else {
            minutes += seconds / 60;
            seconds = seconds % 60;
            int hours = minutes / 60;
            //int remainingMinutes = minutes % 60;
            minutes = minutes % 60;
           // System.out.println("Hours ="+ hours+"h "+minutes+"m "+seconds+"s");
            // if((minutes >= 60)|| (seconds >= 60))
            String time = "Hours = "+ hours+"h "+minutes+"m "+seconds+"s";
            System.out.println("time "+ time);
            return time;
        }
    }
    public static String getDurationString(int seconds) {
        if(seconds < 0 ){
            return "Invalid value";

        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println("time "+ minutes);
        System.out.println("time "+ seconds);
        return getDurationString(minutes,seconds);


    }
}
