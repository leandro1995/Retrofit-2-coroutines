package com.leandro1995.retrofit2coroutines.retrofit

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.leandro1995.retrofit2coroutines.model.User

class RetrofitConvert {
    companion object {

        fun userList(jsonArray: JsonArray): MutableList<User> {
            val userList = mutableListOf<User>()

            jsonArray.forEach {
                userList.add(
                    User(
                        userId = emptyInt(it.asJsonObject["userId"]),
                        id = emptyInt(it.asJsonObject["id"]),
                        title = emptyString(it.asJsonObject["title"]),
                        body = emptyString(it.asJsonObject["body"])
                    )
                )
            }

            return userList
        }

        private fun emptyInt(jsonElement: JsonElement) =
            if (jsonElement.isJsonNull) 0 else jsonElement.asInt

        private fun emptyString(jsonElement: JsonElement) =
            if (jsonElement.isJsonNull) "" else jsonElement.asString
    }
}