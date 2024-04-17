package com.lj.app.show

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lj.domain.model.Country

@Composable
fun PostCard(item: Country) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(border = BorderStroke(2.dp, Color.Gray))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .height(120.dp)
                .padding(start = 8.dp)
        ) {
            Text(text = "Name: ${item.name}", style = MaterialTheme.typography.h6, maxLines = 1)
            Spacer(modifier = Modifier.height(1.dp))
            Text(text = "Region: ${item.region}", style = MaterialTheme.typography.h6, maxLines = 1)
            Spacer(modifier = Modifier.height(1.dp))
            Text(text = "Area: ${item.area}", style = MaterialTheme.typography.h6, maxLines = 1)
            Spacer(modifier = Modifier.height(1.dp))
            Text(text = "Population: ${item.population}", style = MaterialTheme.typography.h6, maxLines = 1)
        }
    }
}
