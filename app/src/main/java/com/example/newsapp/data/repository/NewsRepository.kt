package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.ApiService

class NewsRepository private constructor(val apiService: ApiService) {


    companion object {
        @JvmStatic
        private var INSTANCE: NewsRepository? = null

        fun getInstance(apiService: ApiService): NewsRepository {
            if(INSTANCE == null) {
                INSTANCE = NewsRepository(apiService)
            }

            return INSTANCE as NewsRepository
        }
    }
}