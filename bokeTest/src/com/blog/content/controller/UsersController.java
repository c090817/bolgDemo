package com.blog.content.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.bean.Users;
import com.blog.content.service.UsersService;

@Controller
@RequestMapping(value="/users")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	/**
	 * @date 5/14
	 * @param users
	 * @return
	 * @author chenst
	 * 
	 *         查询测试
	 */
	@ResponseBody
	@RequestMapping(value="/selectUsers.do")
	public String selectTest() {
		JSONObject result = new JSONObject();
		try {
			
			List<Users> list = this.usersService.selectUsers();
			result.put("success", true);
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
}
