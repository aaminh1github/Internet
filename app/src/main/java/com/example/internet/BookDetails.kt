package com.example.internet

import com.google.gson.annotations.SerializedName

class BookDetails {

    @SerializedName("data")
        var data:List<datum>?=null


    class datum {

        @SerializedName("id")
        var id:Int?=null

        @SerializedName("name")
        var name:String?=null

        @SerializedName("year")
        var year:Int?=null

        @SerializedName("pantone_value")
        var pantoneValue:String?=null

    }


}