package com.neu.cxl.service;

import java.util.ArrayList;

import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanResource;

public interface DoubanActorAndDirectorService {
	public ArrayList<DoubanActor> selectActorByMovieId(DoubanResource doubanResource);
	public ArrayList<DoubanDirector> selectDirectorByMovieId(DoubanResource doubanResource) ;
	public ArrayList<DoubanResource> selectMovieByActorId(DoubanActor doubanActor);
	public ArrayList<DoubanResource> selectMovieByDirectorId(DoubanDirector doubanDirector);
	public DoubanActor selectActorById(DoubanActor doubanActor);
	public DoubanDirector selectDirectorById(DoubanDirector doubanDirector);

}
