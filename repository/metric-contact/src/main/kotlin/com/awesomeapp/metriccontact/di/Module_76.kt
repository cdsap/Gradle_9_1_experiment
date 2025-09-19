package com.awesomeapp.metriccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccontact.Viewmodel76_1
import com.awesomeapp.metriccontact.Activity76_2
import com.awesomeapp.metriccontact.Activity76_3
import com.awesomeapp.metriccontact.Fragment76_4
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.metriccontact.Api76_6

@Module
@InstallIn(SingletonComponent::class)
object Module_76 {
    @Provides
    @Singleton
    fun provideRepository76_5(
        api0: Api68_6 = Api68_6(),
        api1: Api72_6 = Api72_6()
    ): Repository76_5 {
        return Repository76_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi76_6(): Api76_6 {
        return Api76_6()
    }
}