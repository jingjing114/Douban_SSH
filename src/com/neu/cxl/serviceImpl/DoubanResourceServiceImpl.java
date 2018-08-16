package com.neu.cxl.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanResourceDAO;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanType;
import com.neu.cxl.service.DoubanResourceService;
@Transactional
@Repository("doubanResourceService")
public class DoubanResourceServiceImpl implements DoubanResourceService{

	@Autowired
	private DoubanResourceDAO doubanResourceDAO;
	
	@Override
	public ArrayList<DoubanResource> selectMovie(int pageSize,int pageCode) {
		return this.doubanResourceDAO.selectMovie( pageSize, pageCode);
	}

	@Override
	public DoubanResource selectMovieById(DoubanResource doubanResource) {
		return this.doubanResourceDAO.selectMovieById(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource,int pageSize,int pageCode) {
		return this.doubanResourceDAO.selectMovieByNameKeyword(doubanResource,pageSize,pageCode);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByType(DoubanResource doubanResource,int pageSize,int pageCode) {
		return this.doubanResourceDAO.selectMovieByType(doubanResource,pageSize,pageCode);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByYear(DoubanResource doubanResource,int pageSize,int pageCode) {
		return this.doubanResourceDAO.selectMovieByYear(doubanResource,pageSize,pageCode);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByScore(DoubanResource doubanResource,int pageSize,int pageCode) {
		return this.doubanResourceDAO.selectMovieByScore(doubanResource,pageSize,pageCode);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByActor(DoubanResource doubanResource,int pageSize,int pageCode) {
		return this .doubanResourceDAO.selectMovieByActor(doubanResource,pageSize,pageCode);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieSortByScore() {
		
		return this.doubanResourceDAO.selectMovieSortByScore();
	}

	@Override
	public ArrayList<DoubanResource> selectMovieSortByReviewNum() {
		return this.doubanResourceDAO.selectMovieSortByReviewNum();
	}
	@Override
	public ArrayList<DoubanType> selectMovieType() {
		return this.doubanResourceDAO.selectMovieType();
	}
}
