package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.yourweather_v2.model.PresentDataSet

@Composable
fun PresentDataCard(
    item: PresentDataSet,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (item.icon != null) {
            Icon(
                imageVector = item.icon,
                contentDescription = null
            )
        } else if (item.iconRes != null) {
            Icon(
                painter = painterResource(item.iconRes),
                contentDescription = null
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = item.value)

        Spacer(modifier = Modifier.height(6.dp))

        Text(text = item.data)
    }
}