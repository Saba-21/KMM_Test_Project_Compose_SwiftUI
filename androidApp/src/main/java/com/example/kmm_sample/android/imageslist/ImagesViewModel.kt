package com.example.kmm_sample.android.imageslist

import androidx.lifecycle.ViewModel
import com.example.kmm_sample.api.ImagesRepository
import com.example.kmm_sample.api.impl.ImagesRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ImagesViewModel constructor(
    private val repository: ImagesRepository = ImagesRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow<ImagesUiState>(ImagesUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        val images = repository.getImages()
        _uiState.value = ImagesUiState.Success(images = images)
    }

}
