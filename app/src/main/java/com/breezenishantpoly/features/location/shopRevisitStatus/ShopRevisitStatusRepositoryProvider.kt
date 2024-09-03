package com.breezenishantpoly.features.location.shopRevisitStatus

import com.breezenishantpoly.features.location.shopdurationapi.ShopDurationApi
import com.breezenishantpoly.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}