package com.breezenishantpoly.features.location.shopRevisitStatus

import com.breezenishantpoly.base.BaseResponse
import com.breezenishantpoly.features.location.model.ShopDurationRequest
import com.breezenishantpoly.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}