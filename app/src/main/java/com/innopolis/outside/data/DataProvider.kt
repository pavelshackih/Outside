package com.innopolis.outside.data

import io.reactivex.Observable

/**
 * @author Sergey Pinkevich
 */
interface DataProvider<T> {
    fun getData(): Observable<T>
}