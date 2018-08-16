package com.neu.cxl.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanReviewService;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport{
	
	@Autowired
	private DoubanReviewService doubanReviewService;
	
	private DoubanUser user;
	private DoubanResource resource=new DoubanResource();
	private int pageCode;
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	
	List <DoubanReview> list = null;
	
	
	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

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
	
	
	
	public DoubanResource getResource() {
		return resource;
	}

	public void setResource(DoubanResource resource) {
		this.resource = resource;
	}

	public String selectReview()
	{
		request.setAttribute("reviewInfo", this.doubanReviewService.selectReview(user,4,this.pageCode));
		return "selectreviewuser"; 
	}
	public void publishReview() throws IOException
	{
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
		review.setReviewtime(date);
		if(this.doubanReviewService.publishReview(review))
		 {
			this.resource.setMovieid(this.review.getReviewmovieid());
			this.doubanReviewService.updateAvgscore(resource, review);
			this.doubanReviewService.updateReviewnumber(resource, review);
     	  response.getWriter().write("<script languge='javascript'>alert('评论发表成功');</script>");
			}
			else
			{
				response.getWriter().write("<script languge='javascript'>alert('评论发表失败'); ;</script>");
			}
	}
	public String deleteReview() throws IOException
	{
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		this.doubanReviewService.deleteReview(review);
		response.getWriter().write("<script languge='javascript'>alert('删除成功');</script>");
			return "selectreviewuser";
	}
	
	public void addgoodcount()
	{
		this.doubanReviewService.addReviewGoodCount(review);
	}
}

