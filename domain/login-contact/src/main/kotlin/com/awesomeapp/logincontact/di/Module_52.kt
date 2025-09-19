package com.awesomeapp.logincontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logincontact.Viewmodel52_1
import com.awesomeapp.logincontact.Activity52_2
import com.awesomeapp.logincontact.Activity52_3
import com.awesomeapp.logincontact.Fragment52_4
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.logincontact.Api52_6

@Module
@InstallIn(SingletonComponent::class)
object Module_52 {
    @Provides
    @Singleton
    fun provideRepository52_5(
        api0: Api36_6 = Api36_6(),
        api1: Api32_6 = Api32_6(),
        api2: Api48_6 = Api48_6(),
        api3: Api40_6 = Api40_6(),
        api4: Api44_6 = Api44_6()
    ): Repository52_5 {
        return Repository52_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi52_6(): Api52_6 {
        return Api52_6()
    }
}