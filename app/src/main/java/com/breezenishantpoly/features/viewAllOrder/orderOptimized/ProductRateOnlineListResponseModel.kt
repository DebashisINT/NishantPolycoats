package com.breezenishantpoly.features.viewAllOrder.orderOptimized

import com.breezenishantpoly.app.domain.ProductOnlineRateTempEntity
import com.breezenishantpoly.base.BaseResponse
import com.breezenishantpoly.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}