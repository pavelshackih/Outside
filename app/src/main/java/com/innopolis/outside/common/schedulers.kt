package com.innopolis.outside.common

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

interface RxScheduler {

    fun getMain(): Scheduler

    fun getNetwork(): Scheduler
}

class RxSchedulersImpl : RxScheduler {

    override fun getMain(): Scheduler = AndroidSchedulers.mainThread()

    override fun getNetwork(): Scheduler = Schedulers.io()
}

class RxSchedulersTestImpl : RxScheduler {

    override fun getMain(): Scheduler = Schedulers.trampoline()

    override fun getNetwork(): Scheduler = Schedulers.trampoline()
}