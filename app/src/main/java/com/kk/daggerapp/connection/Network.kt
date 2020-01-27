package com.kk.daggerapp.connection

import javax.inject.Inject

class NetworkClient @Inject constructor(var mNetworkConnection: NetworkConnection) {

    fun fetchData(): String{
        return mNetworkConnection.doReq()
    }
}

class NetworkConnection @Inject constructor(){

    var mEndPoint: String = "https://kotlinlang.org/docs/tutorials/android-frameworks.html#dagger"


    fun doReq(): String {
        return this.mEndPoint
    }


}