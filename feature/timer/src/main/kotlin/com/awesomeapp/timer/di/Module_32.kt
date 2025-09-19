package com.awesomeapp.timer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timer.Viewmodel32_1
import com.awesomeapp.timer.Activity32_2
import com.awesomeapp.timer.Activity32_3
import com.awesomeapp.timer.Fragment32_4
import com.awesomeapp.timer.Repository32_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.timer.Api32_6

@Module
@InstallIn(SingletonComponent::class)
object Module_32 {
    @Provides
    @Singleton
    fun provideRepository32_5(
        api0: Api20_6 = Api20_6(),
        api1: Api24_6 = Api24_6(),
        api2: Api8_6 = Api8_6(),
        api3: Api12_6 = Api12_6(),
        api4: Api4_6 = Api4_6(),
        api5: Api16_6 = Api16_6()
    ): Repository32_5 {
        return Repository32_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi32_6(): Api32_6 {
        return Api32_6()
    }
}