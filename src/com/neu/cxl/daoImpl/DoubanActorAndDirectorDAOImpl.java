package com.neu.cxl.daoImpl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanActorAndDirectorDAO;
import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanResource;
@Transactional
@Repository("doubanActorAndDirectorDAO")
public class DoubanActorAndDirectorDAOImpl implements DoubanActorAndDirectorDAO{
	

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	//通过电影ID查询演员
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanActor> selectActorByMovieId(DoubanResource doubanResource) {
		String queryString = "from DoubanActor a where a.actorid in (select atm.actorid from DoubanActortomovie atm where atm.movieid=?)";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, doubanResource.getMovieid());
		return (ArrayList<DoubanActor>) queryObject.list();
	}
	//通过电影ID查询导演
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanDirector> selectDirectorByMovieId(DoubanResource doubanResource) {
		String queryString = "from DoubanDirector d where d.directorid in (select dtm.directorid from DoubanDirectortomovie dtm where dtm.movieid=?)";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, doubanResource.getMovieid());
		return (ArrayList<DoubanDirector>) queryObject.list();
	}	
	//通过演员ID查询电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByActorId(DoubanActor doubanActor) {
		String queryString = "from DoubanResource m where m.movieid in (select atm.movieid from DoubanActortomovie atm where atm.actorid=?)";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, doubanActor.getActorid());
		return  (ArrayList<DoubanResource>) queryObject.list();
	}
	//通过导演ID查询电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByDirectorId(DoubanDirector doubanDirector) {
		String queryString = "from DoubanResource m where m.movieid in (select dtm.movieid from DoubanDirectortomovie dtm where dtm.directorid=?)";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, doubanDirector.getDirectorid());
		return  (ArrayList<DoubanResource>) queryObject.list();
	}
	//通过ID查询演员
	@Override
	public DoubanActor selectActorById(DoubanActor doubanActor) {
		Criteria criteria=this.getCurrentSession().createCriteria(DoubanActor.class);
		Criterion criterion=Restrictions.eq("actorid",doubanActor.getActorid());
		criteria.add(criterion);
		
		return (DoubanActor) criteria.uniqueResult();
	}
	//通过ID查询导演 
	@Override
	public DoubanDirector selectDirectorById(DoubanDirector doubanDirector) {
		Criteria criteria=this.getCurrentSession().createCriteria(DoubanDirector.class);
		Criterion criterion=Restrictions.eq("directorid",doubanDirector.getDirectorid());
		criteria.add(criterion);
		
		return (DoubanDirector) criteria.uniqueResult();
	}
	
	
	
	
	
	
}
