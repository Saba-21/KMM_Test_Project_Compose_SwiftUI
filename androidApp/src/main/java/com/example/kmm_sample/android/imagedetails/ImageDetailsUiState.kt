package com.example.kmm_sample.android.imagedetails

import com.example.kmm_sample.api.ImageData

sealed class ImageDetailsUiState {

    object Loading: ImageDetailsUiState()

    data class Success(
        val imageData: ImageData
    ): ImageDetailsUiState()

    data class Error(
        val errorMessage: String
    ): ImageDetailsUiState()

}
