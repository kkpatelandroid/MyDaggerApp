package com.kk.daggerapp.viewmodel

import com.kk.daggerapp.connection.NetworkClient
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(var client: NetworkClient) {

    fun fetchData(): String{
        return client.fetchData()
    }


}