package com.victorino.version.domain

interface VersionRepository {
    fun getVersion(storageKey : String) : String?
    fun setVersion(version : String, storageKey: String)
}