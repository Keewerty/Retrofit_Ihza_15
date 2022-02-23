package com.example.retrofit_ihza_15.infocovid_19.api

import com.example.retrofit_ihza_15.infocovid_19.api.model.IndonesiaResponse
import com.example.retrofit_ihza_15.infocovid_19.api.model.ProvinceResponse
import retrofit2.http.GET
import retrofit2.Call

interface Api {
    @GET("https://learn-retrofit-data.netlify.app/casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("https://learn-retrofit-data.netlify.app/casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}