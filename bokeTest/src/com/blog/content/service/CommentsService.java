package com.blog.content.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.bean.Comments;

public interface CommentsService {
	
	//查询Comments表
	public List<Comments> selectComments();
	
	//发表评论
	public JSONObject insertComments(Comments comments);
	
	//删除评论
	public JSONObject deleteComments(Integer id);
}
