package com.blog.content.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.bean.Comments;
import com.blog.content.mybatis.dao.CommentsDao;
import com.blog.content.service.CommentsService;

@Service("CommentsService")
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	private CommentsDao commentsDao;
	
	@Override
	public List<Comments> selectComments() {
		
		
		return commentsDao.SelectComments();
	}

	
	
	
	@Override
	public JSONObject insertComments(Comments comments) {
		JSONObject basicJson = new JSONObject();
		StringBuffer impResult = new StringBuffer();
		try {
			comments.setName("测试");
			commentsDao.insertComments(comments);
			
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

}
