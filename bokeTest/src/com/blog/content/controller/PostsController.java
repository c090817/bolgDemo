package com.blog.content.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.bean.Posts;
import com.blog.content.service.PostsService;

@Controller
@RequestMapping(value="/post")
public class PostsController {

	
	@Autowired
	private PostsService postsService;
	
	/**
	 * @date 11-15
	 * @param post
	 * @return
	 * @author chenst
	 * 
	 *         查询post表  查询内容
	 */
	@ResponseBody
	@RequestMapping(value="/selectPosts.do")
	public String selectPosts() {
		JSONObject result = new JSONObject();
		try {
			List<Posts> list = postsService.selectPosts();
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
	
	/**
	 * @date 11-15
	 * @param post
	 * @return
	 * @author chenst
	 * 
	 *         post表  发布帖子
	 */
	@ResponseBody
	@RequestMapping(value="/insertPosts.do")
	public String insertPosts(Posts posts) {
		JSONObject result = new JSONObject();
		try {
			result = postsService.insertPosts(posts);
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
	
}
