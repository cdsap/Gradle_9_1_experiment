package com.awesomeapp.podcastcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcontact.Viewmodel92_1
import com.awesomeapp.podcastcontact.Activity92_2
import com.awesomeapp.podcastcontact.Activity92_3
import com.awesomeapp.podcastcontact.Fragment92_4
import com.awesomeapp.podcastcontact.Repository92_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.podcastcontact.Api92_6

@Module
@InstallIn(SingletonComponent::class)
object Module_92 {
    @Provides
    @Singleton
    fun provideRepository92_5(
        api0: Api52_6 = Api52_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api64_6 = Api64_6(),
        api3: Api60_6 = Api60_6()
    ): Repository92_5 {
        return Repository92_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi92_6(): Api92_6 {
        return Api92_6()
    }
}