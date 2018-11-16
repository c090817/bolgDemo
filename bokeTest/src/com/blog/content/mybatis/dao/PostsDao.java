package com.blog.content.mybatis.dao;

import java.util.List;

import com.bean.Posts;

public interface PostsDao {

	
	public List<Posts> selectPosts() ;
	
	public void insertPosts(Posts posts);

}
