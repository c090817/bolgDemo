package com.blog.content.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
