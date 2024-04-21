package com.lj.data

import com.google.gson.annotations.SerializedName
import com.lj.domain.model.Comment
import com.lj.domain.model.Country

data class CommentDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("postId")
    val postId: Int,
    @SerializedName("comment")
    val comment: String
)

fun CommentDto.toModel() = Comment(
    id = this.id,
    postId = this.postId,
    comment = this.comment
)