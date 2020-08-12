package com.codies.quizapp.NetworkUtils;

import com.codies.quizapp.Models.RetrofitModels.ExamData;
import com.google.gson.JsonObject;


import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetQuiz {
    @GET("GetExam?")
    Call<JsonObject> getQuiz(@Query("phoneNumber") String api_key);
}
