package com.breezenishantpoly.features.newcollection.model

import com.breezenishantpoly.app.domain.CollectionDetailsEntity
import com.breezenishantpoly.base.BaseResponse
import com.breezenishantpoly.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}