package com.example.enine9.coolweather.gson;

/**
 * Created by enine9 on 2017/9/5 0005.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
