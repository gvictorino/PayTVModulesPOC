package com.victorino.version.domain

class VersionUseCase(
    private val versionRepository: VersionRepository,
    private val identifier: String
) :
    VersionContract {
    override fun getVersion(): String {
        return "v${versionRepository.getVersion(identifier + "_" + VersionConstants.STORAGE_KEY)}"
    }
}