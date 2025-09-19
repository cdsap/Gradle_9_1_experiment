package com.awesomeapp.accountidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.accountidentity.Viewmodel168_1
import com.awesomeapp.accountidentity.Activity168_2
import com.awesomeapp.accountidentity.Activity168_3
import com.awesomeapp.accountidentity.Fragment168_4
import com.awesomeapp.accountidentity.Repository168_5
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.accountidentity.Api168_6

@Module
@InstallIn(SingletonComponent::class)
object Module_168 {
    @Provides
    @Singleton
    fun provideRepository168_5(
        api0: Api136_6 = Api136_6(),
        api1: Api128_6 = Api128_6(),
        api2: Api132_6 = Api132_6(),
        api3: Api140_6 = Api140_6(),
        api4: Api148_6 = Api148_6(),
        api5: Api144_6 = Api144_6()
    ): Repository168_5 {
        return Repository168_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi168_6(): Api168_6 {
        return Api168_6()
    }
}