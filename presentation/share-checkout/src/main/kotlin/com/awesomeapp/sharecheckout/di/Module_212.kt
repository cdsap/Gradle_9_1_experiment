package com.awesomeapp.sharecheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sharecheckout.Viewmodel212_1
import com.awesomeapp.sharecheckout.Activity212_2
import com.awesomeapp.sharecheckout.Activity212_3
import com.awesomeapp.sharecheckout.Fragment212_4
import com.awesomeapp.sharecheckout.Repository212_5
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.sharecheckout.Api212_6

@Module
@InstallIn(SingletonComponent::class)
object Module_212 {
    @Provides
    @Singleton
    fun provideRepository212_5(
        api0: Api188_6 = Api188_6(),
        api1: Api184_6 = Api184_6()
    ): Repository212_5 {
        return Repository212_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi212_6(): Api212_6 {
        return Api212_6()
    }
}