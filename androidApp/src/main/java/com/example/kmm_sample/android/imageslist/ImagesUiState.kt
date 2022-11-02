package com.example.kmm_sample.android.imageslist

import com.example.kmm_sample.api.ImageData

sealed class ImagesUiState {

    object Loading: ImagesUiState()

    data class Success(
        val images: List<ImageData>
    ): ImagesUiState()

    data class Error(
        val errorMessage: String
    ): ImagesUiState()

}
