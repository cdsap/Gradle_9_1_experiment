package com.awesomeapp.settingcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.settingcheckout.Viewmodel216_1
import com.awesomeapp.settingcheckout.Activity216_2
import com.awesomeapp.settingcheckout.Activity216_3
import com.awesomeapp.settingcheckout.Fragment216_4
import com.awesomeapp.settingcheckout.Repository216_5
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.settingcheckout.Api216_6

@Module
@InstallIn(SingletonComponent::class)
object Module_216 {
    @Provides
    @Singleton
    fun provideRepository216_5(
        api0: Api176_6 = Api176_6(),
        api1: Api200_6 = Api200_6(),
        api2: Api188_6 = Api188_6(),
        api3: Api184_6 = Api184_6()
    ): Repository216_5 {
        return Repository216_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi216_6(): Api216_6 {
        return Api216_6()
    }
}