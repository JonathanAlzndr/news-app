package com.example.newsapp.data.remote

import com.example.newsapp.data.remote.response.BreakingNewsResponse
import com.example.newsapp.data.remote.response.DetailNewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET
    fun getBreakingNews(
        @Query("apiKey") apiKey: String,
        @Query("country") country: String,
        @Query("language") language: String,
        @Query("category") category: String,
    ): Call<BreakingNewsResponse>

    @GET
    fun getNewsDetail(
        @Query("apiKey") apiKey: String,
        @Query("country") country: String,
        @Query("language") language: String,
        @Query("category") category: String,
        @Query("image") image: Int
    ): Call<DetailNewsResponse>
}