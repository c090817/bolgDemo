package com.blog.content.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Posts;
import com.blog.content.mybatis.dao.PostsDao;
import com.blog.content.service.PostsService;

@Service("PostsService")
public class PostsServiceImpl implements PostsService{

	@Autowired
	private PostsDao postsDao;

	@Override
	public List<Posts> selectPosts() {
		
		return postsDao.SelectPosts();
	}
	
	
	
}
