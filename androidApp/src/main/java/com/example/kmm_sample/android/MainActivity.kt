package com.example.kmm_sample.android


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.rememberNavController
import com.example.kmm_sample.android.imagedetails.ImageDetailsViewModel
import com.example.kmm_sample.android.imageslist.ImagesViewModel
import com.example.kmm_sample.android.theme.DarkColorPalette
import com.example.kmm_sample.android.theme.LightColorPalette
import com.example.kmm_sample.android.theme.Shapes
import com.example.kmm_sample.android.theme.Typography

class MainActivity : ComponentActivity() {

    private val imagesListViewModel by viewModels<ImagesViewModel>()
    private val imageDetailsViewModel by viewModels<ImageDetailsViewModel>()

    @ExperimentalFoundationApi
    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val colors = if (isSystemInDarkTheme()) {
                DarkColorPalette
            } else {
                LightColorPalette
            }
            MaterialTheme(
                colors = colors,
                typography = Typography,
                shapes = Shapes,
                content = {
                    Surface(color = MaterialTheme.colors.background) {
                        AppNavigator(
                            imagesListViewModel = imagesListViewModel,
                            imageDetailsViewModel = imageDetailsViewModel,
                            navController = rememberNavController()
                        )
                    }
                }
            )
        }
    }

}

