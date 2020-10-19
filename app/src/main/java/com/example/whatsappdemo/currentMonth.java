package com.example.whatsappdemo;

public class currentMonth {
   private int imageMonth;
   private String monthName;
   private int id;



    public currentMonth(int imageMonth, String monthName, int id) {
        this.imageMonth = imageMonth;
        this.monthName = monthName;
        this.id = id;
    }

    public int getImageMonth() {
        return imageMonth;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getId() {
        return id;
    }
}
