package com.devlife.doglist

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    //Requete de type GET
    @GET
    suspend fun getDogsByBreeds(@Url url: String): Response<DogsResponse>
}