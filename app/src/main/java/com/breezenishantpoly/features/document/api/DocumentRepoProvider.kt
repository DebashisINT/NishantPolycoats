package com.breezenishantpoly.features.document.api

import com.breezenishantpoly.features.dymanicSection.api.DynamicApi
import com.breezenishantpoly.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}