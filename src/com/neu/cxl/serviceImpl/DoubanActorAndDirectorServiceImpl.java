package com.neu.cxl.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanActorAndDirectorDAO;
import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.service.DoubanActorAndDirectorService;
@Transactional
@Repository("doubanActorAndDirectorService")
public class DoubanActorAndDirectorServiceImpl implements DoubanActorAndDirectorService{

	@Autowired
	private DoubanActorAndDirectorDAO doubanActorAndDirectorDAO;

	@Override
	public ArrayList<DoubanActor> selectActorByMovieId(DoubanResource doubanResource) {
		return this.doubanActorAndDirectorDAO.selectActorByMovieId(doubanResource);
	}

	@Override
	public ArrayList<DoubanDirector> selectDirectorByMovieId(DoubanResource doubanResource) {
		return this.doubanActorAndDirectorDAO.selectDirectorByMovieId(doubanResource);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByActorId(DoubanActor doubanActor) {
		return this.doubanActorAndDirectorDAO.selectMovieByActorId(doubanActor);
	}

	@Override
	public ArrayList<DoubanResource> selectMovieByDirectorId(DoubanDirector doubanDirector) {
		return this.doubanActorAndDirectorDAO.selectMovieByDirectorId(doubanDirector);
	}

	@Override
	public DoubanActor selectActorById(DoubanActor doubanActor) {
		return this.doubanActorAndDirectorDAO.selectActorById(doubanActor);
	}

	@Override
	public DoubanDirector selectDirectorById(DoubanDirector doubanDirector) {
		return this.doubanActorAndDirectorDAO.selectDirectorById(doubanDirector);
	}
	

}
