package com.neu.cxl.daoImpl;

import java.util.ArrayList;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanReviewDAO;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanUser;
@Transactional
@Repository("doubanReviewDAO")
public class DoubanReviewDAOImpl implements DoubanReviewDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanReview> selectReview(DoubanUser user,int pageSize,int pageCode) {
		String queryString = "from DoubanReview r where r.reviewuser=? order by reviewtime desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,user.getUsername());
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanReview>) queryObject.list();
	}

	@Override
	public int deleteReview(DoubanReview review) {
		String queryString = "delete from DoubanReview r where r.reviewid=?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,review.getReviewid());
		return queryObject.executeUpdate();
	}

	@Override
	public int publishReview(DoubanReview review) {
		if(this.getCurrentSession().save(review)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@Override
	public int addReviewGoodCount(DoubanReview review) {
		String hql="update DoubanReview r set r.reviewgoodcount = r.reviewgoodcount+1 where r.reviewid = ?";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setString(0, review.getReviewid());
		
		return query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanReview> selectReview(DoubanResource resource,int pageSize,int pageCode) {
		String queryString = "from DoubanReview r where r.reviewmovieid=? order by reviewtime desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,resource.getMovieid());
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanReview>) queryObject.list();
	}

	@Override
	public int updateAvgscore(DoubanResource doubanResource,DoubanReview review) {
		String hql="update DoubanResource m set m.avgscore =(m.avgscore*m.moviereviewnumber+?)/(m.moviereviewnumber+1) where m.movieid = ?";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setFloat(0, review.getReviewscore());
		query.setString(1, review.getReviewmovieid());
		return query.executeUpdate();
	}

	@Override
	public int updateReviewnumber(DoubanResource doubanResource,DoubanReview review) {
		String hql="update DoubanResource m set m.moviereviewnumber=m.moviereviewnumber+1 where m.movieid = ?";
		Query query = this.getCurrentSession().createQuery(hql);
		
		query.setString(0, review.getReviewmovieid());
		return query.executeUpdate();
	}

}
