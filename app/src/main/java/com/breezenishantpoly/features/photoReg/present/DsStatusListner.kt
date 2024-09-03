package com.breezenishantpoly.features.photoReg.present

import com.breezenishantpoly.app.domain.ProspectEntity
import com.breezenishantpoly.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}