package com.example.enine9.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by enine9 on 2017/9/5 0005.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
