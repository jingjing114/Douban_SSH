package com.neu.cxl.service;

import java.util.ArrayList;

import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanActortomovie;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanDirectortomovie;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanType;
import com.neu.cxl.entity.DoubanUser;

public interface DoubanAdminService {
	public boolean deleteMovie(DoubanResource DoubanResource) ;
	public boolean updateMovie(DoubanResource DoubanResource) ;
	public boolean addActor(DoubanActor actor) ;
	public boolean addDirector(DoubanDirector director) ;
	public boolean addMovie(DoubanResource DoubanResource);
	public boolean addCorrespondence(DoubanActortomovie at) ;
	public boolean addCorrespondence(DoubanDirectortomovie dt) ; 
	public boolean deleteDoubanReview(DoubanReview DoubanReview) ;
	public ArrayList<DoubanUser> findAllUser() ;
	public ArrayList<DoubanReview> selectDoubanReview(DoubanUser user);
	public ArrayList<DoubanResource> selectMovie() ;
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource) ;
	//public ArrayList<DoubanUser> selectActor(DoubanActor actor) ;
	//public ArrayList<DoubanUser> selectDirector(DoubanDirector director);
	public boolean deleteActor(DoubanActor actor) ;
	public boolean deleteDirector(DoubanDirector director);
	public boolean updateActor(DoubanActor actor);
	public boolean updateDirector(DoubanDirector director) ;
	public void updateMovieActor(DoubanResource resource);
	public ArrayList<DoubanActor> selectActorByNameKeyword(DoubanActor actor) ;
	public ArrayList<DoubanDirector> selectDirectorByNameKeyword(DoubanDirector direactor) ;
	public DoubanResource selectActor(DoubanResource doubanResource);
	public ArrayList<DoubanActor> selectActor() ;
	public ArrayList<DoubanDirector> selectDirector() ;
	
	public boolean addMovieType(DoubanType type);
	public ArrayList<DoubanType> selectMovieType();
}
