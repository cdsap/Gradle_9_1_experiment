package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.checkoutidentity.Api152_6

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api148_6 = Api148_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api128_6 = Api128_6(),
        api3: Api144_6 = Api144_6(),
        api4: Api140_6 = Api140_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}