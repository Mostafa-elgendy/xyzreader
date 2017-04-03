package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/Protino/dump/master/Lego/data.json" );

           // url = new URL("https://hastebin.com/uwigulelod.sm" );
          //  https://hastebin.com/uwigulelod.sm
          //  url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e("error Connecting",ignored.getMessage());
        }

        BASE_URL = url;
    }
}
