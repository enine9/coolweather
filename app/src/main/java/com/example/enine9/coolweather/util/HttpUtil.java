package com.example.enine9.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by enine9 on 2017/9/2 0002.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
