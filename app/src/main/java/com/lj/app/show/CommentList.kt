package com.lj.app.show

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.lj.domain.model.Comment
import com.lj.domain.model.Country

@Composable
fun CommentList(comments: List<Comment>) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(comments) { item ->
            CommentCard(item)
        }
    }
}