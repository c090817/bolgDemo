package com.blog.content.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value="/post")
public class PostsController {

	
	/**
	 * @date 11-07
	 * @param users
	 * @return
	 * @author chenst
	 * 
	 *         查询post表  查询内容
	 */
	@ResponseBody
	@RequestMapping(value="/selectPost.do")
	public String selectPost() {
		JSONObject result = new JSONObject();
		try {
			
//			List<Users> list = this.selectUsersService.selectUsers();
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
}
