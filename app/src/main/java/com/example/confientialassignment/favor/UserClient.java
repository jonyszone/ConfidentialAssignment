package com.example.confientialassignment.favor;

import com.example.confientialassignment.Model.Login;
import com.example.confientialassignment.Model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserClient {
    @POST("login")
    Call <User> login (@Body Login login);

    @GET("token")
    Call<ResponseBody> getToken (@Header("Authorization") String authToken);
}
