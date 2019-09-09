package com.haidar.root.footballclubapp.menu.club.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ClubModel(val name: String, val description: String, val logo: String) : Parcelable