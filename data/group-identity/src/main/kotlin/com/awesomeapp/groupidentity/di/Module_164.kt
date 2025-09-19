package com.awesomeapp.groupidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.groupidentity.Viewmodel164_1
import com.awesomeapp.groupidentity.Activity164_2
import com.awesomeapp.groupidentity.Activity164_3
import com.awesomeapp.groupidentity.Fragment164_4
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.groupidentity.Api164_6

@Module
@InstallIn(SingletonComponent::class)
object Module_164 {
    @Provides
    @Singleton
    fun provideRepository164_5(
        api0: Api132_6 = Api132_6(),
        api1: Api144_6 = Api144_6(),
        api2: Api148_6 = Api148_6()
    ): Repository164_5 {
        return Repository164_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi164_6(): Api164_6 {
        return Api164_6()
    }
}