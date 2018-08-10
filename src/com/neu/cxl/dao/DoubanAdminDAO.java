package com.neu.cxl.dao;

import java.util.ArrayList;

import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanActortomovie;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanDirectortomovie;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
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
	public ArrayList<DoubanUser> findAllUser() ;
	public ArrayList<DoubanReview> selectDoubanReview(DoubanUser user);
	public ArrayList<DoubanResource> selectMovie() ;
	//public ArrayList<DoubanUser> selectActor(DoubanActor actor) ;
	//public ArrayList<DoubanUser> selectDirector(DoubanDirector director);
	public int deleteActor(DoubanActor actor) ;
	public int deleteDirector(DoubanDirector director);
	public int updateActor(DoubanActor actor);
	public int updateDirector(DoubanDirector director) ;
	
	public ArrayList<DoubanActor> selectActorByNameKeyword(String s) ;
	public ArrayList<DoubanDirector> selectDirectorByNameKeyword(String s) ;

	public ArrayList<DoubanActor> selectActor() ;
	public ArrayList<DoubanDirector> selectDirector() ;

}
