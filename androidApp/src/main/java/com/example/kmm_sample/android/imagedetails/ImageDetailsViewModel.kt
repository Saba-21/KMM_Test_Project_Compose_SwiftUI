package com.example.kmm_sample.android.imagedetails

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.kmm_sample.api.ImagesRepository
import com.example.kmm_sample.api.impl.ImagesRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ImageDetailsViewModel constructor(
    private val repository: ImagesRepository = ImagesRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow<ImageDetailsUiState>(ImageDetailsUiState.Loading)
    val uiState = _uiState.asStateFlow()

    var isLiked = mutableStateOf(false)

    fun getImage(imageId: Int?) {
        _uiState.value = ImageDetailsUiState.Loading
        val image = repository.getImage(imageId)
        if (image != null) {
            isLiked.value = image.isLiked
            _uiState.value = ImageDetailsUiState.Success(image)
        } else {
            _uiState.value = ImageDetailsUiState.Error("Failed to load image.")
        }
    }

    fun likeImage(imageId: Int) {
        val result = repository.likeImage(imageId)
        isLiked.value = result
    }

}
