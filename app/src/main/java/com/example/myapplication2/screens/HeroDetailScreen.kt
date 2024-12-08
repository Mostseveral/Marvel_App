package com.example.myapplication2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.myapplication2.R
import com.example.myapplication2.ui.theme.Marvelgrey
import com.example.myapplication2.ui.theme.Typography

@Composable
fun HeroDetailScreen(navController: NavController, name: String, image: String, description: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Marvelgrey)
    ) {
        // Фоновая картинка героя
        Image(
            painter = rememberAsyncImagePainter(image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            contentScale = ContentScale.Crop
        )

        // Кнопка "Назад" сверху слева
        BackButton(navController = navController)

        // Имя и описание героя внизу по центру
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .align(Alignment.BottomCenter) // Контент внизу по центру
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.align(Alignment.BottomCenter) // Выравнивание снизу по центру
            ) {
                // Имя героя
                Text(
                    text = name,
                    style = Typography.labelSmall,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 8.dp) // Отступ от текста
                )

                // Описание героя
                Text(
                    text = description,
                    style = Typography.bodyLarge,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 32.dp)
                )
            }
        }
    }
}

@Composable
fun BackButton(navController: NavController) {
    IconButton(onClick = { navController.popBackStack() }) {
        Image(
            painter = painterResource(id = R.drawable.arrow_back), // Убедитесь, что путь к вашему ресурсу правильный
            contentDescription = "Back",
            modifier = Modifier.size(32.dp), // Размер иконки можно настроить
            colorFilter = ColorFilter.tint(Color.White) // Цвет иконки (можно убрать, если не нужно)
        )
    }
}
