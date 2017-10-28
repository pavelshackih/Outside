package com.innopolis.outside.screens.splash

import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.DataProvider
import com.innopolis.outside.data.server.NetworkProvider
import com.innopolis.outside.screens.core.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
class SplashPresenter : BasePresenter<SplashView> {

    var view: SplashView? = null
    var disposable: CompositeDisposable? = null
    var service: Service? = null
    lateinit var provider: DataProvider

    @Inject constructor(service: Service) {
        this.service = service
    }

    fun getForecastList() {
        provider = NetworkProvider(service)
    }

    override fun attachView(view: SplashView) {
        this.view = view
        disposable = CompositeDisposable()
    }

    override fun detachView() {
        view = null
        disposable?.clear()
    }
}