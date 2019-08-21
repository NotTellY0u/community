package com.community.service;

import com.community.exception.CustomizeErrorCode;
import com.community.exception.CustomizeException;
import com.community.model.Comment;

public class CommentService {

    public void insert(Comment comment) {
        if(comment.getParentId() == null || comment.getParentId() == 0){
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }

    }
}
