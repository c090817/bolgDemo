package com.blog.content.controller;

import java.util.List;




import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.bean.Posts;
import com.blog.content.service.PostsService;

@Controller
@RequestMapping(value="/post")
public class PostsController {

	
	@Autowired
	private PostsService postsService;
	
	
	
	/**
	 * @date 11-23
	 * @param post
	 * @return
	 * @author chenst
	 * 
	 *         post表  页面
	 */
	@RequestMapping(value = "/postPage.do")
	public ModelAndView postPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/html/post");
		return modelAndView;
	}
	
	
	
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
	public String selectPosts() throws Exception{
		JSONObject result = new JSONObject();
		try {
			List<Posts> list = postsService.selectPosts();
			result.put("list", list);
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
	
	
	/**
	 * @date 11-23
	 * @param post
	 * @return
	 * @author chenst
	 * 
	 *         post表  发布页面
	 */
	@RequestMapping(value = "/createPostPage.do")
	public ModelAndView createPostPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/html/createPosts");
		return modelAndView;
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
	@RequestMapping(value="/insertPosts.do", method = RequestMethod.POST)
	public String insertPosts(ModelAndView modelAndView, HttpServletRequest request) throws Exception{
		JSONObject result = new JSONObject();
		try {
			Posts posts = new Posts();
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			posts.setTitle(title);
			posts.setContent(content);
			
			result = postsService.insertPosts(posts);
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
	/**
	 * @date 11-20
	 * @param post
	 * @return
	 * @author chenst
	 * 
	 *         post表  删除
	 */
	@ResponseBody
	@RequestMapping(value="/deletePosts.do")
	public String deletePosts(Integer id) throws Exception{
		JSONObject result = new JSONObject();
		try {
			result = postsService.deletePosts(id);
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
	
}
