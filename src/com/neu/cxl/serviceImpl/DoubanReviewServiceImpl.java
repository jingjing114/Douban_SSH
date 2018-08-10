package com.neu.cxl.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanReviewDAO;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanReviewService;
@Transactional
@Repository("doubanReviewService")
public class DoubanReviewServiceImpl implements DoubanReviewService{

	@Autowired
	private DoubanReviewDAO doubanReviewDAO;
	
	
	@Override
	public ArrayList<DoubanReview> selectReview(DoubanUser user) {
		return this.doubanReviewDAO.selectReview(user);
	}

	@Override
	public boolean deleteReview(DoubanReview review) {
		if(this.doubanReviewDAO.deleteReview(review)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean publishReview(DoubanReview review) {
		review.setReviewgoodcount(0);
		if(this.doubanReviewDAO.publishReview(review)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void addReviewGoodCount(DoubanReview review) {
		this.doubanReviewDAO.addReviewGoodCount(review);
		
	}

	@Override
	public ArrayList<DoubanReview> selectReview(DoubanResource resource) {
		return this.doubanReviewDAO.selectReview(resource);
	}

}
