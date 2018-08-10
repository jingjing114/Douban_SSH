package com.neu.cxl.service;

import java.util.ArrayList;

import com.neu.cxl.entity.DoubanResource;

public interface DoubanResourceService {
	public ArrayList<DoubanResource> selectMovie();
	public DoubanResource 			 selectMovieById(DoubanResource doubanResource) ;
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource) ;
	public ArrayList<DoubanResource> selectMovieByType(DoubanResource doubanResource) ;
	public ArrayList<DoubanResource> selectMovieByYear(DoubanResource doubanResource) ;
	public ArrayList<DoubanResource> selectMovieByScore(DoubanResource doubanResource);
	public ArrayList<DoubanResource> selectMovieByActor(DoubanResource doubanResource) ;
	
	/*public ArrayList<DoubanResource> sortMovieByScore(ResultSort resultsort) ;
	public ArrayList<DoubanResource> sortMovieByYear(ResultSort resultsort) ;
	public ArrayList<DoubanResource> sortMovieByReviewNum(ResultSort resultsort) ;*/
	public ArrayList<DoubanResource> selectMovieSortByScore() ;
	public ArrayList<DoubanResource> selectMovieSortByReviewNum() ;

	//public  ArrayList<DoubanResource> selectMovie(ResultSort resultsort) ;

}
