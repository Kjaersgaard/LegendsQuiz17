package com.example.kjaer.legendsquiz;


import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.URL;

public class HttpTest {
    OkHttpClient client;

    Request request;
    String jensen = "Mads er : ";
    Response response;
    public HttpTest() {
        client = new OkHttpClient();
        String resultBody = "";
        request = new Request
                .Builder()
                .url("http://ec2-35-165-42-120.us-west-2.compute.amazonaws.com:8080/LolRest/webresources/lolsoapaccess/hentbruger/s153086/nusnus")
                .build();
        try {
            response = client.newCall(request).execute();
            if (response != null){
                jensen  +=  response.toString();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try {
            Log.d("response was : ", response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getTestResponse(){

        return "jensen er nice";
    }

    public URL getRequest() {

return null;
    }
}

