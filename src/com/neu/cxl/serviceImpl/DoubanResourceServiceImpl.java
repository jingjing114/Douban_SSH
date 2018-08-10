package com.neu.cxl.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanResourceDAO;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.service.DoubanResourceService;
@Transactional
@Repository("doubanResourceService")
public class DoubanResourceServiceImpl implements DoubanResourceService{

	@Autowired
	private DoubanResourceDAO doubanResourceDAO;
	
	@Override
	public ArrayList<DoubanResource> selectMovie() {
		return this.doubanResourceDAO.selectMovie();
	}

	@Override
	public DoubanResource selectMovieById(DoubanResource doubanResource) {
		return this.doubanResourceDAO.selectMovieById(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource) {
		return this.doubanResourceDAO.selectMovieByNameKeyword(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByType(DoubanResource doubanResource) {
		return this.doubanResourceDAO.selectMovieByType(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByYear(DoubanResource doubanResource) {
		return this.doubanResourceDAO.selectMovieByYear(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByScore(DoubanResource doubanResource) {
		return this.doubanResourceDAO.selectMovieByScore(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByActor(DoubanResource doubanResource) {
		return this .doubanResourceDAO.selectMovieByActor(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieSortByScore() {
		
		return this.doubanResourceDAO.selectMovieSortByScore();
	}

	@Override
	public ArrayList<DoubanResource> selectMovieSortByReviewNum() {
		return this.doubanResourceDAO.selectMovieSortByReviewNum();
	}

}
