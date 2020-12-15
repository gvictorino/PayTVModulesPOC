package com.victorino.version.builders

import android.content.SharedPreferences
import com.victorino.version.data.VersionRepositoryImpl
import com.victorino.version.domain.GetVersionUseCase
import com.victorino.version.domain.SetVersionUseCase

class VersionUseCaseBuilder() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var appIdentifier: String

    fun setSharedPreferences(sharedPreferences: SharedPreferences){
        this.sharedPreferences = sharedPreferences
    }

    fun setAppIdentifier(appIdentifier: String){
        this.appIdentifier = appIdentifier
    }

    fun buildGetVersion(): GetVersionUseCase {
        return GetVersionUseCase(VersionRepositoryImpl(sharedPreferences), appIdentifier)
    }

    fun buildSetVersion(): SetVersionUseCase {
        return SetVersionUseCase(VersionRepositoryImpl(sharedPreferences), appIdentifier)
    }
}