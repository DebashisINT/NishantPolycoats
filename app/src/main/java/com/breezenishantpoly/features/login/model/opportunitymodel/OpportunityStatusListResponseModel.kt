package com.breezenishantpoly.features.login.model.opportunitymodel

import com.breezenishantpoly.app.domain.OpportunityStatusEntity
import com.breezenishantpoly.app.domain.ProductListEntity
import com.breezenishantpoly.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}