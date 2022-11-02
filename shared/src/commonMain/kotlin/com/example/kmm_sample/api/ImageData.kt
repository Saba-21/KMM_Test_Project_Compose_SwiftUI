package com.example.kmm_sample.api

data class ImageData(
    val id: Int,
    val location: String?,
    val url: String,
    val tags: List<String>,
    var isLiked: Boolean
)
