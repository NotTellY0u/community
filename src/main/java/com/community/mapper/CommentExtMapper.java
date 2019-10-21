package com.community.mapper;

import com.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}