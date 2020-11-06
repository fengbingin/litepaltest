package com.example.coolweather.util;

import android.app.DownloadManager;

/**
 * Created by fengbingbin on 2020/11/5.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
