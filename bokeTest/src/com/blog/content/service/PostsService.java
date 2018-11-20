package com.blog.content.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.bean.Posts;

public interface PostsService {

	//查询posts表
	public List<Posts> selectPosts();
	
	//发布帖子
	public JSONObject insertPosts(Posts posts);
	
	//删除帖子
	public JSONObject deletePosts(Integer id);
}
