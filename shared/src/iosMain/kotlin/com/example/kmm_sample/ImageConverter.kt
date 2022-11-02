package com.example.kmm_sample

import com.example.kmm_sample.api.ImageData

actual class ImageConverter actual constructor() {

    actual fun getUrl(image: ImageData): String {
        return image.url
    }

}