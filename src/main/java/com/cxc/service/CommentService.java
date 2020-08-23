package com.cxc.service;

import com.cxc.po.Comment;

import java.util.List;

/**
 * Created by cxc on 2019/10/22.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
