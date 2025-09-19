package com.awesomeapp.alarmcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Viewmodel80_1
import com.awesomeapp.alarmcontact.Activity80_2
import com.awesomeapp.alarmcontact.Activity80_3
import com.awesomeapp.alarmcontact.Fragment80_4
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.alarmcontact.Api80_6

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api52_6 = Api52_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api64_6 = Api64_6()
    ): Repository80_5 {
        return Repository80_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}