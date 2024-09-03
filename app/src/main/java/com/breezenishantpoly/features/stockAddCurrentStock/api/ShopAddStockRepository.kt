package com.breezenishantpoly.features.stockAddCurrentStock.api

import com.breezenishantpoly.base.BaseResponse
import com.breezenishantpoly.features.location.model.ShopRevisitStatusRequest
import com.breezenishantpoly.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezenishantpoly.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezenishantpoly.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezenishantpoly.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}