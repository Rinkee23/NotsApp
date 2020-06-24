package `in`.surelocal.notsapp.datalayer

import com.google.gson.annotations.SerializedName

data class UserInfo(
    @SerializedName("title")
    val title:String ="",
    @SerializedName("description")
    val description:String ="",
    @SerializedName("Timestamp")
    val Timestamp: Long,
    @SerializedName("latitude")
    val latitude:String="",
    @SerializedName("longitude")
    val longitude:String="",
    @SerializedName("postalCode")
    val postalCode:String="",
    @SerializedName("location")
    val location:String=""
)
