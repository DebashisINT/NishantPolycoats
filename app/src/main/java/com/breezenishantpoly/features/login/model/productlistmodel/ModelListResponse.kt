package com.breezenishantpoly.features.login.model.productlistmodel

import com.breezenishantpoly.app.domain.ModelEntity
import com.breezenishantpoly.app.domain.ProductListEntity
import com.breezenishantpoly.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}