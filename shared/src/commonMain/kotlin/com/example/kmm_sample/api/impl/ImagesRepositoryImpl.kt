package com.example.kmm_sample.api.impl

import com.example.kmm_sample.api.ImageData
import com.example.kmm_sample.api.ImagesRepository

class ImagesRepositoryImpl : ImagesRepository {

    private val imagesData = ImagesDataSourceImpl().getImages()

    override fun getImage(imageId: Int?): ImageData? {
        return imagesData.find { it.id == imageId }
    }

    override fun getImages(): List<ImageData> {
        return imagesData
    }

    override fun likeImage(imageId: Int): Boolean {
        val imageData = imagesData.firstOrNull { imageId == it.id }?.apply {
            isLiked = !isLiked
        }
        return imageData?.isLiked ?: false
    }

}
