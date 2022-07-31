package com.metehanbolat.sealedenumcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.sealedenumcompose.ui.theme.SealedEnumComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val error: HttpError = HttpError.NotFound
            when(error) {
                HttpError.NotFound -> Unit
                is HttpError.Unauthorized -> Unit
            }

            val errorEnum: HttpErrorEnum = HttpErrorEnum.NotFound
            HttpErrorEnum.values().forEach(::println)
            when(errorEnum) {
                HttpErrorEnum.NotFound -> TODO()
                HttpErrorEnum.Unauthorized -> TODO()
            }
        }
    }
}
