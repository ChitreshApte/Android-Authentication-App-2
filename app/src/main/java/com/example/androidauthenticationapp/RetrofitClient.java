package com.example.androidauthenticationapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// RetrofitClient that performs all the operations of a REST API client
// i.e. sending requests and receiving responses.
// It is a singleton class (only one instance at a time)

public class RetrofitClient {

    //private static final String BASE_URL = " http://46.101.208.101:8080/";
    private static final String BASE_URL = "https://users-android-api.herokuapp.com/api/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;


    private RetrofitClient () {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }


    public API getAPI () {
        return retrofit.create(API.class);
    }
}