package com.example.newsapp.di

import com.example.newsapp.data.remote.ApiService
import com.example.newsapp.data.repository.NewsRepository

object Injection {
    fun provideRepository(apiService: ApiService): NewsRepository {
        return NewsRepository.getInstance(apiService)
    }
}