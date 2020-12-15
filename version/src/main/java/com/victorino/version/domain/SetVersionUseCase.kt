package com.victorino.version.domain

class SetVersionUseCase(
    private val versionRepository: VersionRepository,
    private val identifier: String
) :
    VersionContracts.SetVersion {
    override fun invoke(version: String) {
        val storageKey = identifier + "_" + VersionConstants.STORAGE_KEY
        versionRepository.setVersion(version, storageKey)
    }
}