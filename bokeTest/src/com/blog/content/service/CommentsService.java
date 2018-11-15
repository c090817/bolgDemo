package com.blog.content.service;

import java.util.List;

import com.bean.Comments;

public interface CommentsService {
	
	//查询Comments表
	public List<Comments> selectComments();
}
