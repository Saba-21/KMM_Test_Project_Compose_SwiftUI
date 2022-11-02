package com.example.kmm_sample.api

interface ImagesRepository {

    fun getImage(imageId: Int?): ImageData?

    fun getImages(): List<ImageData>

    fun likeImage(imageId: Int): Boolean

}
