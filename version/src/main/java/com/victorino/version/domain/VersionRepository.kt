package com.victorino.version.domain

interface VersionRepository {
    fun getVersion(storageKey : String) : String
}