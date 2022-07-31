package com.metehanbolat.sealedenumcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.sealedenumcompose.ui.theme.SealedEnumComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SealedEnumComposeTheme {

            }
        }
    }
}
