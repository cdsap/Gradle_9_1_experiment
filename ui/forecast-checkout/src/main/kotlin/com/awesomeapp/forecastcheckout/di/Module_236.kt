package com.awesomeapp.forecastcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecastcheckout.Viewmodel236_1
import com.awesomeapp.forecastcheckout.Activity236_2
import com.awesomeapp.forecastcheckout.Activity236_3
import com.awesomeapp.forecastcheckout.Fragment236_4
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.forecastcheckout.Api236_6

@Module
@InstallIn(SingletonComponent::class)
object Module_236 {
    @Provides
    @Singleton
    fun provideRepository236_5(
        api0: Api204_6 = Api204_6(),
        api1: Api212_6 = Api212_6(),
        api2: Api220_6 = Api220_6(),
        api3: Api216_6 = Api216_6(),
        api4: Api208_6 = Api208_6(),
        api5: Api224_6 = Api224_6()
    ): Repository236_5 {
        return Repository236_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi236_6(): Api236_6 {
        return Api236_6()
    }
}