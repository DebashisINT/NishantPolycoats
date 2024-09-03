package com.breezenishantpoly.features.dashboard.presentation.api.dayStartEnd

import com.breezenishantpoly.features.stockCompetetorStock.api.AddCompStockApi
import com.breezenishantpoly.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}