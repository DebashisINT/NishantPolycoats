package com.breezenishantpoly.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezenishantpoly.app.FileUtils
import com.breezenishantpoly.app.Pref
import com.breezenishantpoly.base.BaseResponse
import com.breezenishantpoly.features.addshop.model.AddLogReqData
import com.breezenishantpoly.features.addshop.model.AddShopRequestData
import com.breezenishantpoly.features.addshop.model.AddShopResponse
import com.breezenishantpoly.features.addshop.model.LogFileResponse
import com.breezenishantpoly.features.addshop.model.UpdateAddrReq
import com.breezenishantpoly.features.contacts.CallHisDtls
import com.breezenishantpoly.features.contacts.CompanyReqData
import com.breezenishantpoly.features.contacts.ContactMasterRes
import com.breezenishantpoly.features.contacts.SourceMasterRes
import com.breezenishantpoly.features.contacts.StageMasterRes
import com.breezenishantpoly.features.contacts.StatusMasterRes
import com.breezenishantpoly.features.contacts.TypeMasterRes
import com.breezenishantpoly.features.dashboard.presentation.DashboardActivity
import com.breezenishantpoly.features.login.model.WhatsappApiData
import com.breezenishantpoly.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}