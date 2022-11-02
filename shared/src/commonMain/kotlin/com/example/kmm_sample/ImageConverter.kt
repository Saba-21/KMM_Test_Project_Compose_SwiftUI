package com.example.kmm_sample

import com.example.kmm_sample.api.ImageData

expect class ImageConverter() {
    fun getUrl(image: ImageData): String
}