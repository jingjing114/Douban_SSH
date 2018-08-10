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
	public ArrayList<DoubanReview> selectReview(DoubanUser user) {
		String queryString = "from DoubanReview r where r.reviewuser=? order by reviewtime desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,user.getUsername());
		queryObject.setFirstResult(0);
		queryObject.setMaxResults(10);
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
	public ArrayList<DoubanReview> selectReview(DoubanResource resource) {
		String queryString = "from DoubanReview r where r.movieid=? order by reviewtime desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,resource.getMovieid());
		queryObject.setFirstResult(0);
		queryObject.setMaxResults(10);
		return (ArrayList<DoubanReview>) queryObject.list();
	}

}
