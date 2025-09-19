package com.awesomeapp.logincart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logincart.Viewmodel248_1
import com.awesomeapp.logincart.Activity248_2
import com.awesomeapp.logincart.Activity248_3
import com.awesomeapp.logincart.Fragment248_4
import com.awesomeapp.logincart.Repository248_5
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.logincart.Api248_6

@Module
@InstallIn(SingletonComponent::class)
object Module_248 {
    @Provides
    @Singleton
    fun provideRepository248_5(
        api0: Api220_6 = Api220_6(),
        api1: Api204_6 = Api204_6()
    ): Repository248_5 {
        return Repository248_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi248_6(): Api248_6 {
        return Api248_6()
    }
}