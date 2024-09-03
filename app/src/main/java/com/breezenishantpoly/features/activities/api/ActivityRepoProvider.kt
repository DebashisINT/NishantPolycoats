package com.breezenishantpoly.features.activities.api

import com.breezenishantpoly.features.member.api.TeamApi
import com.breezenishantpoly.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}