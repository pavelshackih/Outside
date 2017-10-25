package com.innopolis.outside.data.server

import com.innopolis.outside.data.DataProvider
import io.reactivex.Observable

/**
 * @author Sergey Pinkevich
 */
class NetworkProvider : DataProvider<ServerResponse> {

    override fun getData(): Observable<ServerResponse> {
        return Observable.just(null)
    }
}