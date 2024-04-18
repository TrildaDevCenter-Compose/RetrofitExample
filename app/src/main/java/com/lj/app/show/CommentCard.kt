package com.lj.app.show

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.lj.domain.model.Comment

@Composable
fun CommentCard(item: Comment) {
    Card(
    ) {
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
                Text(text = "postId: ${item.postId}", style = MaterialTheme.typography.bodyMedium, maxLines = 1)
                Spacer(modifier = Modifier.height(1.dp))
                Text(text = "comment: ${item.comment}", style = MaterialTheme.typography.bodyMedium, maxLines = 1)
            }
        }
    }
}
