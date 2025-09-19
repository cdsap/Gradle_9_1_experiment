package com.awesomeapp.identitycheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.identitycheckout.Viewmodel200_1
import com.awesomeapp.identitycheckout.Activity200_2
import com.awesomeapp.identitycheckout.Activity200_3
import com.awesomeapp.identitycheckout.Fragment200_4
import com.awesomeapp.identitycheckout.Repository200_5
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.identitycheckout.Api200_6

@Module
@InstallIn(SingletonComponent::class)
object Module_200 {
    @Provides
    @Singleton
    fun provideRepository200_5(
        api0: Api172_6 = Api172_6(),
        api1: Api156_6 = Api156_6(),
        api2: Api164_6 = Api164_6(),
        api3: Api160_6 = Api160_6(),
        api4: Api152_6 = Api152_6(),
        api5: Api168_6 = Api168_6()
    ): Repository200_5 {
        return Repository200_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi200_6(): Api200_6 {
        return Api200_6()
    }
}