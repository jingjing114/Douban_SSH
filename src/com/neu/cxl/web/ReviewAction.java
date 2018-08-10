package com.neu.cxl.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanReviewService;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport{
	
	@Autowired
	private DoubanReviewService doubanReviewService;
	
	private DoubanUser user;
	
	HttpServletRequest request = ServletActionContext.getRequest();
	List <DoubanReview> list = null;
	public DoubanUser getUser() {
		return user;
	}

	public void setUser(DoubanUser user) {
		this.user = user;
	}

	private DoubanReview review;

	public DoubanReview getReview() {
		return review;
	}

	public void setReview(DoubanReview review) {
		this.review = review;
	}
	
	public String selectReview()
	{
		request.setAttribute("reviewInfo", this.doubanReviewService.selectReview(user));
		return "selectreviewuser"; 
	}
}
