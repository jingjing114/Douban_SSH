package com.neu.cxl.dao;

import java.util.ArrayList;


import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanType;



public interface DoubanResourceDAO {
	public ArrayList<DoubanResource> selectMovie(int pageSize,int pageCode);
	public DoubanResource 			 selectMovieById(DoubanResource doubanResource) ;
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource,int pageSize,int pageCode) ;
	public ArrayList<DoubanResource> selectMovieByType(DoubanResource doubanResource,int pageSize,int pageCode) ;
	public ArrayList<DoubanResource> selectMovieByYear(DoubanResource doubanResource,int pageSize,int pageCode) ;
	public ArrayList<DoubanResource> selectMovieByScore(DoubanResource doubanResource,int pageSize,int pageCode);
	public ArrayList<DoubanResource> selectMovieByActor(DoubanResource doubanResource,int pageSize,int pageCode) ;
	
	/*public ArrayList<DoubanResource> sortMovieByScore(ResultSort resultsort) ;
	public ArrayList<DoubanResource> sortMovieByYear(ResultSort resultsort) ;
	public ArrayList<DoubanResource> sortMovieByReviewNum(ResultSort resultsort) ;*/
	public ArrayList<DoubanResource> selectMovieSortByScore() ;
	public ArrayList<DoubanResource> selectMovieSortByReviewNum() ;
	public ArrayList<DoubanType> selectMovieType();
	//public  ArrayList<DoubanResource> selectMovie(ResultSort resultsort) ;

	


}
