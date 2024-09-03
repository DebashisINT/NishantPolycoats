package com.breezenishantpoly.features.stockCompetetorStock.api

import com.breezenishantpoly.base.BaseResponse
import com.breezenishantpoly.features.orderList.model.NewOrderListResponseModel
import com.breezenishantpoly.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezenishantpoly.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}