package com.blog.content.service;

import java.util.List;

import com.bean.Posts;

public interface PostsService {

	//查询posts表
	public List<Posts> selectPosts();
	
}
