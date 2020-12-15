package com.victorino.version.domain

interface VersionContracts {
    interface GetVersion {
        operator fun invoke(): String?
    }

    interface SetVersion {
        operator fun invoke(version: String)
    }
}