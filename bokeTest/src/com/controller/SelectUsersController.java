package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.service.SelectUsersService;
import com.bean.Users;

@Controller
@RequestMapping(value="/selectUsers")
public class SelectUsersController {

	@Autowired
	private SelectUsersService selectUsersService;
	
	/**
	 * @date 5/14
	 * @param users
	 * @return
	 * @author chenst
	 * 
	 *         查询测试
	 */
	@ResponseBody
	@RequestMapping(value="/selectTest.do")
	public String selectTest() {
		JSONObject result = new JSONObject();
		try {
			
			List<Users> list = this.selectUsersService.selectUsers();
			result.put("success", true);
			for(int i = 0 ;i<list.size() ;i++){
				
			Integer id = list.get(i).getId();
			String email = list.get(i).getEmail();
			String password = list.get(i).getPassword();
			String username = list.get(i).getUsername();
			System.out.println(id+email+password+username);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", false);
		}
		String text = "<textarea>" + result.toString() + "</textarea>";
		return text;
	}
	
}
