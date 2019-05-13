package com.bawei.caolina20190513.net;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

import com.google.common.io.CharStreams;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
 *@Auther:cln
 *@Date: 时间
 *@Description:功能
 * */
public class HttpUtil {
    private static final HttpUtil ourInstance = new HttpUtil();

    public static HttpUtil getInstance() {
        return ourInstance;
    }

    private HttpUtil() {
    }

    @SuppressLint("StaticFieldLeak")
    public void doHttpGet(String surl, final CallBackPost post) {
        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... strings) {
                try {
                    URL url = new URL(strings[0]);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);
                    if (connection.getResponseCode() == 200) {
                        return CharStreams.toString(new InputStreamReader(connection.getInputStream()));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                post.onSuccess(s);
            }
        }.execute(surl);

    }
}
