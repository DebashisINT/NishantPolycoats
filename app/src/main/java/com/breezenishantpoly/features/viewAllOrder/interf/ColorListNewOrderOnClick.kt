package com.breezenishantpoly.features.viewAllOrder.interf

import com.breezenishantpoly.app.domain.NewOrderColorEntity
import com.breezenishantpoly.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}