data class Post(
        val id: Int,
        val ownerId: Int,
        val fromId: Int,
        val createdBy: Int,
        val date: Int,
        val text: String?,
        val replyOwnerId: Int?,
        val replyPostId: Int?,
        val friendsOnly: Boolean,
        val comments: List<Comment>?,
        val likes: List<Like>?,
        val reposts: Repost?,
        val postType: String,
        val signerId: Int,
        val canPin: Boolean,
        val canDelete: Boolean,
        val canEdit: Boolean,
        val isPinned: Boolean,
        val markedAsAdds: Boolean,
        val isFavorite: Boolean,
        val attachments: List<Attachment>?
)