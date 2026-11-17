// SimilarRecommendation.kt

package com.momi.music.models

import com.music.innertube.models.YTItem
import com.momi.music.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
