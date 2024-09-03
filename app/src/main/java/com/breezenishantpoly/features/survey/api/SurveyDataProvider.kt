package com.breezenishantpoly.features.survey.api

import com.breezenishantpoly.features.photoReg.api.GetUserListPhotoRegApi
import com.breezenishantpoly.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}