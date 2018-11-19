package com.blog.content.mybatis.dao;

import java.util.List;

import com.bean.Comments;
import com.bean.Posts;

public interface CommentsDao {

	public List<Comments> SelectComments() ;
	
	public void insertComments(Comments comments);
}
