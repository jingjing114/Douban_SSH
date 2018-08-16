package com.neu.cxl.dao;

import java.util.ArrayList;

import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanUser;



public interface DoubanReviewDAO {
	public ArrayList<DoubanReview> selectReview(DoubanUser user,int pageSize,int pageCode) ;
	public int deleteReview(DoubanReview review);
	public int publishReview(DoubanReview review) ;
	public int addReviewGoodCount(DoubanReview review) ;
	public ArrayList<DoubanReview> selectReview(DoubanResource resource,int pageSize,int pageCode) ;
	public int updateAvgscore(DoubanResource doubanResource,DoubanReview review);
	public int updateReviewnumber(DoubanResource doubanResource,DoubanReview review);
}
