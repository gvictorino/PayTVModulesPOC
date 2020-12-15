package com.victorino.version.domain

class GetVersionUseCase(
    private val versionRepository: VersionRepository,
    private val identifier: String
) :
    VersionContracts.GetVersion {
    override fun invoke(): String? {
        val version = versionRepository.getVersion(identifier + "_" + VersionConstants.STORAGE_KEY)
        version?.let {
            return "v${it}"
        }
        return null
    }
}