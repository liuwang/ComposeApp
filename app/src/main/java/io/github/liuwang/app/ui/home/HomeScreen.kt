package io.github.liuwang.app.ui.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object Home : NavKey

@Composable
fun HomeScreen() {
    Text("This is a title")
}