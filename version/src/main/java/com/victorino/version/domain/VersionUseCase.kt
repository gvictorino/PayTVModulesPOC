package com.victorino.version.domain

class VersionUseCase(
    private val versionRepository: VersionRepository,
    private val identifier: String
) :
    VersionContract {
    override fun getVersion(): String? {
        val version = versionRepository.getVersion(identifier + "_" + VersionConstants.STORAGE_KEY)
        version?.let {
            return "v${it}"
        }
        return null
    }
}