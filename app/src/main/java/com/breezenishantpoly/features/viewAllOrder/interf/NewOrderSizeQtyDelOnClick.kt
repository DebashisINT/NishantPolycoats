package com.breezenishantpoly.features.viewAllOrder.interf

import com.breezenishantpoly.app.domain.NewOrderGenderEntity
import com.breezenishantpoly.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}