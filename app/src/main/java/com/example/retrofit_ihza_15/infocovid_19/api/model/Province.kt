package com.example.retrofit_ihza_15.infocovid_19.api.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("Kode Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus Posi")
    val positive: Int,
    @SerializedName("Kasus Sem")
    val recover: Int,
    @SerializedName("Kasus Meni")
    val death: Int
)