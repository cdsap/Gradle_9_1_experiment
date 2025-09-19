package com.awesomeapp.locationidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationidentity.Viewmodel160_1
import com.awesomeapp.locationidentity.Activity160_2
import com.awesomeapp.locationidentity.Activity160_3
import com.awesomeapp.locationidentity.Fragment160_4
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.locationidentity.Api160_6

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api136_6 = Api136_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api140_6 = Api140_6(),
        api3: Api148_6 = Api148_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}