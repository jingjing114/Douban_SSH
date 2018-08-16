package com.neu.cxl.dao;

import java.util.ArrayList;

import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanActortomovie;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanDirectortomovie;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanType;
import com.neu.cxl.entity.DoubanUser;


public interface DoubanAdminDAO {
	
	public int deleteMovie(DoubanResource DoubanResource) ;
	public int updateMovie(DoubanResource DoubanResource) ;
	public int addActor(DoubanActor actor) ;
	public int addDirector(DoubanDirector director) ;
	public int addMovie(DoubanResource DoubanResource);
	public int addCorrespondence(DoubanActortomovie at) ;
	public int addCorrespondence(DoubanDirectortomovie dt) ; 
	public int deleteDoubanReview(DoubanReview DoubanReview) ;
	public ArrayList<DoubanUser> findAllUser(int pageSize,int pageCode) ;
	public ArrayList<DoubanReview> selectDoubanReview(DoubanUser user);
	public ArrayList<DoubanResource> selectMovie() ;
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource) ;
	//public ArrayList<DoubanUser> selectActor(DoubanActor actor) ;
	//public ArrayList<DoubanUser> selectDirector(DoubanDirector director);
	public int deleteActor(DoubanActor actor) ;
	public int deleteDirector(DoubanDirector director);
	public int updateActor(DoubanActor actor);
	public int updateDirector(DoubanDirector director) ;
	public int updateMovieActor(DoubanResource resource);
	public ArrayList<DoubanActor> selectActorByNameKeyword(DoubanActor actor) ;
	public ArrayList<DoubanDirector> selectDirectorByNameKeyword(DoubanDirector direactor) ;
	public DoubanResource selectActor(DoubanResource doubanResource);
	public ArrayList<DoubanActor> selectActor() ;
	public ArrayList<DoubanDirector> selectDirector() ;
	
	public int addMovieType(DoubanType type);
	public ArrayList<DoubanType> selectMovieType();

}
