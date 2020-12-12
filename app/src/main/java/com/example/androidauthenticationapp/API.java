package com.example.androidauthenticationapp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

// API class to handle the requests and responses.
// The API object will be created by the retrofit.

public interface API {
    @POST("register")
    Call<ResponseBody> createUser (
            @Body User user
    );

    @POST("login")
    Call<ResponseBody> checkUser (
            @Body User user
    );
}