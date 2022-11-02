package com.example.kmm_sample.api

interface ImagesDataSource {
    fun getImages(): List<ImageData>
}