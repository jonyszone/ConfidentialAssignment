package com.example.confientialassignment;

import android.text.TextUtils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServicesForRetrofit {

    public static final String BASE_URL = "https://recruitment.fisdev.com/api/login/";
    static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory
                    .create()
            );

    static Retrofit retrofit = builder.build();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}

