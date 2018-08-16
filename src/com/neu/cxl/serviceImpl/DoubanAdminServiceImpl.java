package com.neu.cxl.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanAdminDAO;
import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanActortomovie;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanDirectortomovie;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanType;
import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanAdminService;
@Transactional
@Repository("doubanAdminService")
public class DoubanAdminServiceImpl implements DoubanAdminService{

	@Autowired
	private DoubanAdminDAO doubanAdminDAO;
	//删除电影
	@Override
	public boolean deleteMovie(DoubanResource DoubanResource) {
		if(this.doubanAdminDAO.deleteMovie(DoubanResource)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
	//修改电影
	@Override
	public boolean updateMovie(DoubanResource DoubanResource) {
		if(this.doubanAdminDAO.updateMovie(DoubanResource)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//添加演员
	@Override
	public boolean addActor(DoubanActor actor) {
		if(this.doubanAdminDAO.addActor(actor)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//添加导演
	@Override
	public boolean addDirector(DoubanDirector director) {
		
		if(this.doubanAdminDAO.addDirector(director)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//添加电影
	@Override
	public boolean addMovie(DoubanResource DoubanResource) {
		DoubanResource.setMoviereviewnumber(0);
		DoubanResource.setAvgscore((float)0);
		
		if(this.doubanAdminDAO.addMovie(DoubanResource)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//添加演员与电影关系
	@Override
	public boolean addCorrespondence(DoubanActortomovie at) {
		if(this.doubanAdminDAO.addCorrespondence(at)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//添加导演与电影关系
	@Override
	public boolean addCorrespondence(DoubanDirectortomovie dt) {
		if(this.doubanAdminDAO.addCorrespondence(dt)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//删除非法评论
	@Override
	public boolean deleteDoubanReview(DoubanReview DoubanReview) {
		if(this.doubanAdminDAO.deleteDoubanReview(DoubanReview)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//查询所有用户
	@Override
	public ArrayList<DoubanUser> findAllUser(int pageSize,int pageCode) {
		return this.doubanAdminDAO.findAllUser(pageSize,pageCode);
	}
	//查询用户评论
	@Override
	public ArrayList<DoubanReview> selectDoubanReview(DoubanUser user) {
		return this.doubanAdminDAO.selectDoubanReview(user);
	}
	//查询电影
	@Override
	public ArrayList<DoubanResource> selectMovie() {
		return this.doubanAdminDAO.selectMovie();
	}
	//删除演员
	@Override
	public boolean deleteActor(DoubanActor actor) {
		if(this.doubanAdminDAO.deleteActor(actor)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//删除导演
	@Override
	public boolean deleteDirector(DoubanDirector director) {
		if(this.doubanAdminDAO.deleteDirector(director)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//修改演员
	@Override
	public boolean updateActor(DoubanActor actor) {
		if(this.doubanAdminDAO.updateActor(actor)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//修改导演
	@Override
	public boolean updateDirector(DoubanDirector director) {
		if(this.doubanAdminDAO.updateDirector(director)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//通过名字查询演员
	@Override
	public ArrayList<DoubanActor> selectActorByNameKeyword(DoubanActor actor) {
		return this.doubanAdminDAO.selectActorByNameKeyword(actor);
	}
	//通过名字查询导演
	@Override
	public ArrayList<DoubanDirector> selectDirectorByNameKeyword(DoubanDirector direactor) {
		return this.doubanAdminDAO.selectDirectorByNameKeyword(direactor);
	}
	//查询演员
	@Override
	public ArrayList<DoubanActor> selectActor() {
		return this.doubanAdminDAO.selectActor();
	}
	//查询导演
	@Override
	public ArrayList<DoubanDirector> selectDirector() {
		return this.doubanAdminDAO.selectDirector();
	}
	//通过名字查询电影
	@Override
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource) {
		return this.doubanAdminDAO.selectMovieByNameKeyword(doubanResource);
	}
	@Override
	public void updateMovieActor(DoubanResource resource) {
		this.doubanAdminDAO.updateMovieActor(resource);
	}
	@Override
	public DoubanResource selectActor(DoubanResource doubanResource) {
		return this.doubanAdminDAO.selectActor(doubanResource);
	}
	@Override
	public boolean addMovieType(DoubanType type) {
		if(this.doubanAdminDAO.addMovieType(type)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public ArrayList<DoubanType> selectMovieType() {
		return this.doubanAdminDAO.selectMovieType();
	}
}
