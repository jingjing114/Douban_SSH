package com.neu.cxl.service;

import java.util.ArrayList;

import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanUser;

public interface DoubanReviewService {
	public ArrayList<DoubanReview> selectReview(DoubanUser user) ;
	public boolean deleteReview(DoubanReview review);
	public boolean publishReview(DoubanReview review) ;
	public void addReviewGoodCount(DoubanReview review) ;
	public ArrayList<DoubanReview> selectReview(DoubanResource resource,int pageSize,int pageCode) ;

}
