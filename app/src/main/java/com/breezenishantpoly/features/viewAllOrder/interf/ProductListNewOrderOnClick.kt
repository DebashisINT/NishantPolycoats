package com.breezenishantpoly.features.viewAllOrder.interf

import com.breezenishantpoly.app.domain.NewOrderGenderEntity
import com.breezenishantpoly.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}