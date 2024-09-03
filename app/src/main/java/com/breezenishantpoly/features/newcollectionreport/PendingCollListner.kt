package com.breezenishantpoly.features.newcollectionreport

import com.breezenishantpoly.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}