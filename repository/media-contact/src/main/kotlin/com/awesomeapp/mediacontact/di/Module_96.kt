package com.awesomeapp.mediacontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacontact.Viewmodel96_1
import com.awesomeapp.mediacontact.Activity96_2
import com.awesomeapp.mediacontact.Activity96_3
import com.awesomeapp.mediacontact.Fragment96_4
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.mediacontact.Api96_6

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(
        api0: Api60_6 = Api60_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api68_6 = Api68_6(),
        api3: Api64_6 = Api64_6(),
        api4: Api52_6 = Api52_6()
    ): Repository96_5 {
        return Repository96_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}