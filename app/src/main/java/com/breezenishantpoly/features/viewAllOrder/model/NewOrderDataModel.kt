package com.breezenishantpoly.features.viewAllOrder.model

import com.breezenishantpoly.app.domain.NewOrderColorEntity
import com.breezenishantpoly.app.domain.NewOrderGenderEntity
import com.breezenishantpoly.app.domain.NewOrderProductEntity
import com.breezenishantpoly.app.domain.NewOrderSizeEntity
import com.breezenishantpoly.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

