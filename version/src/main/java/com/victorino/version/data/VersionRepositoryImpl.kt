package com.victorino.version.data

import android.content.SharedPreferences
import com.victorino.version.domain.VersionRepository

class VersionRepositoryImpl(private val sharedPreferences: SharedPreferences) : VersionRepository {
    override fun getVersion(storageKey: String): String? {
        return sharedPreferences.getString(storageKey, null)
    }

    override fun setVersion(version: String, storageKey: String) {
        sharedPreferences.edit().putString(storageKey, version).apply()
    }
}
