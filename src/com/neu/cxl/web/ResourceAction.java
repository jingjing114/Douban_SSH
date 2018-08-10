package com.neu.cxl.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.service.DoubanActorAndDirectorService;
import com.neu.cxl.service.DoubanResourceService;

import com.opensymphony.xwork2.ActionSupport;

public class ResourceAction extends ActionSupport{
	@Autowired
	private DoubanResourceService doubanResourceService;
	@Autowired
	private DoubanActorAndDirectorService doubanActorAndDirectorService;
	
	private DoubanResource resource=new DoubanResource();
	private DoubanActor actor;
	private DoubanDirector director;
	
	
	
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
		
		
		if(keyword==null||"".equals(keyword))
		{
			list=this.doubanResourceService.selectMovie();
		}
		else if(type.equals("moviename"))
		{
			//System.out.println(keyword+type);
			this.resource.setMoviename(this.keyword);
			list=this.doubanResourceService.selectMovieByNameKeyword(this.resource);
			
		}
		else if(type.equals("avgscore"))
		{
			this.resource.setAvgscore(keyword);
			list=this.doubanResourceService.selectMovieByScore(this.resource);
		}
		else if(type.equals("movietype"))
		{
			this.resource.setMovietype(keyword);
			list=this.doubanResourceService.selectMovieByType(this.resource);
		}
		else if(type.equals("movieactorid"))
		{
			this.resource.setMovieactorid(keyword);
			list=this.doubanResourceService.selectMovieByActor(this.resource);
		}
		else if(type.equals("movieyear"))
		{
			this.resource.setMovieyear(keyword);
			list=this.doubanResourceService.selectMovieByYear(this.resource);
		}
		
	        request.setAttribute("movielist", list);
	        return "selectmovie";
	}
	//电影类型查询
	public String selectMovieByType()
	{
		
		this.resource.setMovietype(type);
		list=this.doubanResourceService.selectMovieByType(this.resource);
		 request.setAttribute("movielist", list);
	        return "selectmovie";
		
	}
	//热度排行榜
	public String selectHot()
	{
		request.setAttribute("movielist",this.doubanResourceService.selectMovieSortByReviewNum());
		return "selecthot";
	}
	//电影详情
	public String movieInfo()
	{
		request.setAttribute("movie",this.doubanResourceService.selectMovieById(resource));
		request.setAttribute("movie",this.doubanResourceService.selectMovieById(resource));
		request.setAttribute("movie",this.doubanResourceService.selectMovieById(resource));
		return "movieinfo";
	}
}
