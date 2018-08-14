package com.neu.cxl.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.Page;
import com.neu.cxl.service.DoubanActorAndDirectorService;
import com.neu.cxl.service.DoubanResourceService;
import com.neu.cxl.service.DoubanReviewService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ResourceAction extends ActionSupport{
	@Autowired
	private DoubanResourceService doubanResourceService;
	@Autowired
	private DoubanActorAndDirectorService doubanActorAndDirectorService;
	@Autowired
	private DoubanReviewService doubanReviewService;
	
	private DoubanResource resource=new DoubanResource();
	private DoubanActor actor;
	private DoubanDirector director;
	//private Page page=new Page();
	private int pageCode;
	private int pageSize=15;
	
	
	
	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}

	public DoubanActor getActor() {
		return actor;
	}

	public void setActor(DoubanActor actor) {
		this.actor = actor;
	}

	public DoubanDirector getDirector() {
		return director;
	}

	public void setDirector(DoubanDirector director) {
		this.director = director;
	}

	private String type;
	private String keyword;
	HttpServletRequest request = ServletActionContext.getRequest();
	List <DoubanResource> list = null;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public DoubanResource getResource() {
		return resource;
	}

	public void setResource(DoubanResource resource) {
		this.resource = resource;
	}
	//电影查询
	public String selectMovie()
	{
		
		 this.type=request.getParameter("type");
		 this.keyword=request.getParameter("keyword");
		 
		 if(request.getParameter("pageCode")==null)
			{	
				this.setPageCode(1);
			}
		 else
		 {
			 this.setPageCode(Integer.parseInt(request.getParameter("pageCode")));
		 }
		 
		//System.out.println(pageCode);
		if(keyword==null||"".equals(keyword))
		{
			list=this.doubanResourceService.selectMovie(this.pageSize,this.pageCode);
		}
		else if(type.equals("moviename"))
		{
			//System.out.println(keyword+type);
			this.resource.setMoviename(this.keyword);
			list=this.doubanResourceService.selectMovieByNameKeyword(this.resource,this.pageSize,this.pageCode);
			
		}
		else if(type.equals("avgscore"))
		{
			this.resource.setAvgscore(keyword);
			list=this.doubanResourceService.selectMovieByScore(this.resource,this.pageSize,this.pageCode);
		}
		else if(type.equals("movietype"))
		{
			this.resource.setMovietype(keyword);
			list=this.doubanResourceService.selectMovieByType(this.resource,this.pageSize,this.pageCode);
		}
		else if(type.equals("movieactorid"))
		{
			this.resource.setMovieactorid(keyword);
			list=this.doubanResourceService.selectMovieByActor(this.resource,this.pageSize,this.pageCode);
		}
		else if(type.equals("movieyear"))
		{
			this.resource.setMovieyear(keyword);
			list=this.doubanResourceService.selectMovieByYear(this.resource,this.pageSize,this.pageCode);
		}
		else if(Integer.parseInt(keyword)==1)
		{
			this.resource.setMovietype(type);
			list=this.doubanResourceService.selectMovieByType(this.resource,this.pageSize,this.pageCode);
		}
		
		if(this.list.size()<=0)
		{
			ActionContext.getContext().put("msg", "换个关键字试试...");
			return "selectmovie";
		}
		request.setAttribute("movielist", this.list);
		request.setAttribute("pageCode", this.pageCode);
		request.setAttribute("type", this.type);
		request.setAttribute("keyword", this.keyword);
	        return "selectmovie";
	        
	}
	//电影类型查询
	/*public String selectMovieByType()
	{
		
		this.resource.setMovietype(type);
		list=this.doubanResourceService.selectMovieByType(this.resource,this.pageSize,this.pageCode);
		request.setAttribute("movielist",list);
	        return "selectmovie";
		
	}*/
	//热度排行榜
	public String selectHot()
	{
		request.setAttribute("movielist",this.doubanResourceService.selectMovieSortByReviewNum());
		return "selecthot";
	}
	//电影详情
	public String movieInfo()
	{
		
		request.setAttribute("actor",this.doubanActorAndDirectorService.selectActorByMovieId(resource));
		request.setAttribute("director",this.doubanActorAndDirectorService.selectDirectorByMovieId(resource));
		request.setAttribute("movie",this.doubanResourceService.selectMovieById(resource));
		request.setAttribute("review", this.doubanReviewService.selectReview(resource,10,this.pageCode));
		return "movieinfo";
	}
}
