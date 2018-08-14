package com.neu.cxl.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.service.DoubanActorAndDirectorService;
import com.opensymphony.xwork2.ActionSupport;

public class ActorAndDirectorAction extends ActionSupport{
	@Autowired
	private DoubanActorAndDirectorService doubanActorAndDirectorService;
	
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
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	public String selectActor()
	{
		request.setAttribute("actortomovie", this.doubanActorAndDirectorService.selectMovieByActorId(actor));
		request.setAttribute("actor",this.doubanActorAndDirectorService.selectActorById(actor));
		return "actorinfo";
	}
	public String selectDirector()
	{
		request.setAttribute("directortomovie", this.doubanActorAndDirectorService.selectMovieByDirectorId(director));
		request.setAttribute("director",this.doubanActorAndDirectorService.selectDirectorById(director));
		return "directorinfo";
	}
}
