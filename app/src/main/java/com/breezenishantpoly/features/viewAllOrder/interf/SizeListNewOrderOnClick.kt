package com.breezenishantpoly.features.viewAllOrder.interf

import com.breezenishantpoly.app.domain.NewOrderProductEntity
import com.breezenishantpoly.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}