package com.example.enine9.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by enine9 on 2017/9/5 0005.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    //josn中数组的处理方法，先实体类成员，再声明实体集合。
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
