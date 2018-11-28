package com.blog.content.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.bean.Posts;
import com.blog.content.mybatis.dao.PostsDao;
import com.blog.content.service.PostsService;

@Service("PostsService")
public class PostsServiceImpl implements PostsService{

	@Autowired
	private PostsDao postsDao;

	@Override
	public List<Posts> selectPosts() {
		List<Posts> list = postsDao.selectPosts();
		return list;
	}
	
	

	@Override
	public JSONObject insertPosts(Posts posts) {
		JSONObject basicJson = new JSONObject();
		StringBuffer impResult = new StringBuffer();
		try {
//			posts.setTitle("测试");
			postsDao.insertPosts(posts);
			
			impResult.append("插入成功");
		} catch (Exception e) {
			impResult.append("插入失败");
			e.printStackTrace();
		} finally {
			basicJson.put("value", impResult.toString());
		}
		

		basicJson.put("value", impResult.toString());
		return basicJson;
	}



	@Override
	public JSONObject deletePosts(Integer id) {
		JSONObject basicJson = new JSONObject();
		StringBuffer impResult = new StringBuffer();
		try {
			postsDao.deletePosts(id);
			
			impResult.append("删除成功");
		} catch (Exception e) {
			impResult.append("删除失败");
			e.printStackTrace();
		} finally {
			basicJson.put("value", impResult.toString());
		}

		basicJson.put("value", impResult.toString());
		return basicJson;
	}



	@Override
	public List<Posts> selectPostsById(Integer id) {
		List<Posts> list = postsDao.selectPostsById(id);
		return list;
	}
	
	
	
}
