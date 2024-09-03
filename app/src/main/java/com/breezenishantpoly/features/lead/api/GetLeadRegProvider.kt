package com.breezenishantpoly.features.lead.api

import com.breezenishantpoly.features.NewQuotation.api.GetQuotListRegRepository
import com.breezenishantpoly.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}