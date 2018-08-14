package com.neu.cxl.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;


import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanActortomovie;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanDirectortomovie;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanType;
import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanAdminService;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	@Autowired
	private DoubanAdminService doubanAdminService;
	
	private DoubanActor actor;
	private DoubanDirector director;
	private DoubanResource resource;
	private DoubanUser user;
	private DoubanReview review;
	private DoubanActortomovie atm ;
	private DoubanDirectortomovie dtm;
	private File myfile;
	private String myfileFileName;
	private String myfileContentType;
	private DoubanType type;
	
	public DoubanType getType() {
		return type;
	}


	public void setType(DoubanType type) {
		this.type = type;
	}


	public File getMyfile() {
		return myfile;
	}


	public void setMyfile(File myfile) {
		this.myfile = myfile;
	}


	public String getMyfileFileName() {
		return myfileFileName;
	}


	public void setMyfileFileName(String myfileFileName) {
		this.myfileFileName = myfileFileName;
	}


	public String getMyfileContentType() {
		return myfileContentType;
	}


	public void setMyfileContentType(String myfileContentType) {
		this.myfileContentType = myfileContentType;
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
	public DoubanResource getResource() {
		return resource;
	}
	public void setResource(DoubanResource resource) {
		this.resource = resource;
	}
	public DoubanUser getUser() {
		return user;
	}
	public void setUser(DoubanUser user) {
		this.user = user;
	}
	public DoubanReview getReview() {
		return review;
	}
	public void setReview(DoubanReview review) {
		this.review = review;
	}
	public DoubanActortomovie getAtm() {
		return atm;
	}
	public void setAtm(DoubanActortomovie atm) {
		this.atm = atm;
	}
	public DoubanDirectortomovie getDtm() {
		return dtm;
	}
	public void setDtm(DoubanDirectortomovie dtm) {
		this.dtm = dtm;
	}
	HttpServletResponse response=ServletActionContext.getResponse();
	HttpServletRequest request = ServletActionContext.getRequest();
	//用户列表
	public String  userManage()
	{
		request.setAttribute("userlist", this.doubanAdminService.findAllUser());
		return "usermanage";
	}
	//用户评论
	public String selectReview()
	{
		request.setAttribute("review", this.doubanAdminService.selectDoubanReview(user));
		request.setAttribute("reviewuser", this.user.getUsername());
		return "success";
	}
	//删除评论
	public String deleteReview()
	{
		this.doubanAdminService.deleteDoubanReview(review);
		return "userreview";
	}
	//查询电影
	public String selectMovie()
	{
		request.setAttribute("movielist", this.doubanAdminService.selectMovie());
		return "selectmovie";
	}
	//通过名字查询电影
	public String selectMovieByName()
	{
		request.setAttribute("movielist", this.doubanAdminService.selectMovieByNameKeyword(resource));
		return "selectmovie";
	}
	//通过名字查询演员
		public String selectActorByName()
		{
			request.setAttribute("actorlist", this.doubanAdminService.selectActorByNameKeyword(getActor()));
			return "selectactor";
		}
		//通过名字查询导演
		public String selectDirectorByName()
		{
			request.setAttribute("directorlist", this.doubanAdminService.selectDirectorByNameKeyword(director));
			return "selectdirector";
		}
	//查询演员
	public String selectActor()
	{
		request.setAttribute("actorlist", this.doubanAdminService.selectActor());
		return "selectactor";
	}
	//查询导演
	public String selectDirector()
	{
		request.setAttribute("directorlist", this.doubanAdminService.selectDirector());
		return "selectdirector";
	}
	//添加电影
	public void addMovie() throws IOException
	{
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		if(this.myfile==null)
		{
			this.doubanAdminService.updateMovie(resource);
			
			return;
		}
		String path=ServletActionContext.getServletContext().getRealPath("/upload/movie");
		File file=new File(path);
		if(!file.exists())
		{
			file.mkdirs();
		}
		
			FileUtils.copyFile(myfile,new File(file,this.myfileFileName));
		
		resource.setMovieimgurl("upload/movie/"+this.myfileFileName);

		if(this.doubanAdminService.addMovie(resource))
		 {
			request.getSession().setAttribute("movieid", this.resource.getMovieid());
			response.getWriter().write("<script languge='javascript'>alert('添加成功'); window.location.href='JSP/actorAdd.jsp';</script>");
     	  
			}
		else
		{
			request.setAttribute("addmsg", "添加失败");
		}	
		
		
	}
	//添加演员
	public void addActor() throws IOException
	{
		
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		if(this.myfile==null)
		{
			this.doubanAdminService.updateActor(actor);
			
			return;
		}
		String path=ServletActionContext.getServletContext().getRealPath("/upload/actor");
		File file=new File(path);
		if(!file.exists())
		{
			file.mkdirs();
		}
		
			FileUtils.copyFile(myfile,new File(file,this.myfileFileName));
		
		actor.setActorphoto("upload/actor/"+this.myfileFileName);

		if(this.doubanAdminService.addActor(actor))
		{
			response.addHeader("Content-Type", "text/html;charset=utf-8");
			//System.out.println(atm.getMovieid());
			String s=this.doubanAdminService.selectActor(resource).getMovieactorid();
			if(s==null)
			{
				s="";
			}
			this.resource.setMovieactorid(s+this.actor.getActorname()+"/");
			this.doubanAdminService.updateMovieActor(resource);
			this.atm.setActorid(this.actor.getActorid());
			
			this.doubanAdminService.addCorrespondence(atm);
		
			request.setAttribute("addactormsg", "添加成功");
			response.getWriter().write("<script languge='javascript'>alert('添加成功'); if(window.confirm('是否继续添加演员?')){window.location.href='JSP/actorAdd.jsp';}else {window.location.href='JSP/directorAdd.jsp';}</script>");
			
		}
		else
		{
			request.setAttribute("addactormsg", "添加失败");
		}		
	}
	//添加导演
	public void addDirector() throws IOException
	{
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		if(this.myfile==null)
		{
			this.doubanAdminService.updateDirector(director);
			
			return;
		}
		String path=ServletActionContext.getServletContext().getRealPath("/upload/director");
		File file=new File(path);
		if(!file.exists())
		{
			file.mkdirs();
		}
		
			FileUtils.copyFile(myfile,new File(file,this.myfileFileName));
		
	director.setDirectorphoto("upload/director/"+this.myfileFileName);
		
		
		if(this.doubanAdminService.addDirector(director))
		{
			response.addHeader("Content-Type", "text/html;charset=utf-8");
			this.dtm.setDirectorid(this.director.getDirectorid());
			
			this.doubanAdminService.addCorrespondence(dtm);
		
			request.setAttribute("adddirectormsg", "添加成功");
			response.getWriter().write("<script languge='javascript'>alert('添加成功'); if(window.confirm('是否继续添加导演?')){window.location.href='JSP/directorAdd.jsp';}else {window.location.href='JSP/movieSelect.jsp';}</script>");
			
		}
		else
		{
			request.setAttribute("adddirectormsg", "添加失败");
		}	
	}
	//删除电影
	public void deleteMovie() throws IOException
	{
		if(this.doubanAdminService.deleteMovie(resource))
		{ 
			response.addHeader("Content-Type", "text/html;charset=utf-8");
		response.getWriter().write("<script languge='javascript'>alert('删除成功'); window.location.href='JSP/movieSelect.jsp';</script>");
		
	}
	}
	//删除演员
	public void deleteActor() throws IOException
	{
		if(this.doubanAdminService.deleteActor(actor))
		{ 
			response.addHeader("Content-Type", "text/html;charset=utf-8");
		response.getWriter().write("<script languge='javascript'>alert('删除成功'); window.location.href='JSP/actorSelect.jsp';</script>");
		
	}
	}
	//删除导演
	public void deleteDirector() throws IOException
	{
		if(this.doubanAdminService.deleteDirector(director))
		{ 
			response.addHeader("Content-Type", "text/html;charset=utf-8");
		response.getWriter().write("<script languge='javascript'>alert('删除成功'); window.location.href='JSP/directorSelect.jsp';</script>");
		
	}
	}
	//修改电影
	public void updateMovie() throws IOException
	{
		
	response.addHeader("Content-Type", "text/html;charset=utf-8");
			if(this.myfile==null)
			{
				this.doubanAdminService.updateMovie(resource);
				
				return;
			}
			String path=ServletActionContext.getServletContext().getRealPath("/upload/movie");
			File file=new File(path);
			if(!file.exists())
			{
				file.mkdirs();
			}
			
				FileUtils.copyFile(myfile,new File(file,this.myfileFileName));
			
			resource.setMovieimgurl("upload/movie/"+this.myfileFileName);

			if(this.doubanAdminService.updateMovie(resource))
			 {
	     	  
	     	  response.getWriter().write("<script languge='javascript'>alert('修改成功'); window.location.href='JSP/movieSelect.jsp';</script>");
	     	  
				}
				else
				{
					response.getWriter().write("<script languge='javascript'>alert('修改失败'); window.location.href='JSP/movieSelect.jsp';</script>");
					
				}	
	}
	
	//修改演员
	public void updateActor() throws IOException
	{
		
	response.addHeader("Content-Type", "text/html;charset=utf-8");
			if(this.myfile==null)
			{
				this.doubanAdminService.updateActor(actor);
				
				return;
			}
			String path=ServletActionContext.getServletContext().getRealPath("/upload/actor");
			File file=new File(path);
			if(!file.exists())
			{
				file.mkdirs();
			}
			
				FileUtils.copyFile(myfile,new File(file,this.myfileFileName));
			
			actor.setActorphoto("upload/actor/"+this.myfileFileName);

			if(this.doubanAdminService.updateActor(actor))
			 {
	     	  
	     	  response.getWriter().write("<script languge='javascript'>alert('修改成功'); window.location.href='JSP/actorSelect.jsp';</script>");
	     	  
				}
				else
				{
					response.getWriter().write("<script languge='javascript'>alert('修改失败'); window.location.href='JSP/actorSelect.jsp';</script>");
					
				}	
	}
	//修改导演
	public void updateDirector() throws IOException
	{
		
	response.addHeader("Content-Type", "text/html;charset=utf-8");
			if(this.myfile==null)
			{
				this.doubanAdminService.updateDirector(director);
				
				return;
			}
			String path=ServletActionContext.getServletContext().getRealPath("/upload/director");
			File file=new File(path);
			if(!file.exists())
			{
				file.mkdirs();
			}
			
				FileUtils.copyFile(myfile,new File(file,this.myfileFileName));
			
			director.setDirectorphoto("upload/director/"+this.myfileFileName);

			if(this.doubanAdminService.updateDirector(director))
			 {
	     	  
	     	  response.getWriter().write("<script languge='javascript'>alert('修改成功'); window.location.href='JSP/directorSelect.jsp';</script>");
	     	  
				}
				else
				{
					response.getWriter().write("<script languge='javascript'>alert('修改失败'); window.location.href='JSP/directorSelect.jsp';</script>");
					
				}	
	}
	//添加电影类型
	public String addType()
	{
		this.doubanAdminService.addMovieType(type);
		return "selecttype";
	}
	public String selectType()
	{
		
		request.setAttribute("type", this.doubanAdminService.selectMovieType());
		return "selecttype";
	}
}
