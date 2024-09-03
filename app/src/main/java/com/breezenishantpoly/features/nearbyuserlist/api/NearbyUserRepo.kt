package com.breezenishantpoly.features.nearbyuserlist.api

import com.breezenishantpoly.app.Pref
import com.breezenishantpoly.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezenishantpoly.features.newcollection.model.NewCollectionListResponseModel
import com.breezenishantpoly.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}