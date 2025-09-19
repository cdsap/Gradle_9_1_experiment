package com.awesomeapp.fileidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileidentity.Viewmodel180_1
import com.awesomeapp.fileidentity.Activity180_2
import com.awesomeapp.fileidentity.Activity180_3
import com.awesomeapp.fileidentity.Fragment180_4
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.fileidentity.Api180_6

@Module
@InstallIn(SingletonComponent::class)
object Module_180 {
    @Provides
    @Singleton
    fun provideRepository180_5(
        api0: Api172_6 = Api172_6(),
        api1: Api152_6 = Api152_6(),
        api2: Api168_6 = Api168_6()
    ): Repository180_5 {
        return Repository180_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi180_6(): Api180_6 {
        return Api180_6()
    }
}