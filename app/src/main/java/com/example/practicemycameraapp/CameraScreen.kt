package com.example.practicemycameraapp

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun CameraScreen() {
    var isGranted by remember{ mutableStateOf(false) }
    PermissionHandler { granted ->
        isGranted = granted
    }

    if (isGranted){
        Box(){
            Text(text = "カメラの権限を確認できました")
        }
    } else {
        Text(text = "カメラの権限がありません")
    }
}