package com.blog.content.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.bean.Comments;
import com.blog.content.service.CommentsService;

@Controller
@RequestMapping(value="/comments")
public class CommentsController {

	@Autowired
	private CommentsService commentsService;
	
	/**
	 * @date 11-15
	 * @param comments
	 * @return
	 * @author chenst
	 * 
	 *         查询comments表  查询内容
	 */
	@ResponseBody
	@RequestMapping(value="/selectComments.do")
	public String selectComments() {
		JSONObject result = new JSONObject();
		try {
			List<Comments> list = commentsService.selectComments();
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
	
	
	
	/**
	 * @date 11-19
	 * @param comments
	 * @return
	 * @author chenst
	 * 
	 *         comments表  发表评论
	 */
	@ResponseBody
	@RequestMapping(value="/insertComments.do")
	public String insertComments(Comments comments) {
		JSONObject result = new JSONObject();
		try {
			result = commentsService.insertComments(comments);
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
	
	/**
	 * @date 11-21
	 * @param comments
	 * @return
	 * @author chenst
	 * 
	 *         comments表  删除评论
	 */
	@ResponseBody
	@RequestMapping(value="/deleteComments.do")
	public String deleteComments(Integer id) {
		JSONObject result = new JSONObject();
		try {
			result = commentsService.deleteComments(id);
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
}
