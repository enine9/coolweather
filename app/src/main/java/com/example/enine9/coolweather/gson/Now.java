package com.example.enine9.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by enine9 on 2017/9/5 0005.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
