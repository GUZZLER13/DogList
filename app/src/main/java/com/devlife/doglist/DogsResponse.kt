package com.devlife.doglist

import com.google.gson.annotations.SerializedName

data class DogsResponse(

    /*Le SerializedName doit correspondre exactement au nom qui est retourné par la requête GET,
    et la variable correspondante peut porter n'importe quel nom
    */

    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)
