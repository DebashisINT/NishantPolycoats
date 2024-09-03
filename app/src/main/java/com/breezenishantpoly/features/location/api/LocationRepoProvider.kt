package com.breezenishantpoly.features.location.api

import com.breezenishantpoly.features.location.shopdurationapi.ShopDurationApi
import com.breezenishantpoly.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}