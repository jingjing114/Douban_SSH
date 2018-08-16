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

import com.neu.cxl.dao.DoubanAdminDAO;
import com.neu.cxl.entity.DoubanActor;
import com.neu.cxl.entity.DoubanActortomovie;
import com.neu.cxl.entity.DoubanDirector;
import com.neu.cxl.entity.DoubanDirectortomovie;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanReview;
import com.neu.cxl.entity.DoubanType;
import com.neu.cxl.entity.DoubanUser;
@Transactional
@Repository("doubanAdminDAO")
public class DoubanAdminDAOImpl implements DoubanAdminDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public int deleteMovie(DoubanResource DoubanResource) {
		String queryString = "delete from DoubanResource m where m.movieid=?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,DoubanResource.getMovieid());
		return queryObject.executeUpdate();
	}

	@Override
	public int updateMovie(DoubanResource DoubanResource) {
		this.getCurrentSession().update(DoubanResource);
		return 1;
	}

	@Override
	public int addActor(DoubanActor actor) {
		if(this.getCurrentSession().save(actor)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@Override
	public int addDirector(DoubanDirector director) {
		if(this.getCurrentSession().save(director)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@Override
	public int addMovie(DoubanResource DoubanResource) {
		if(this.getCurrentSession().save(DoubanResource)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@Override
	public int addCorrespondence(DoubanActortomovie at) {
		if(this.getCurrentSession().save(at)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@Override
	public int addCorrespondence(DoubanDirectortomovie dt) {
		if(this.getCurrentSession().save(dt)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@Override
	public int deleteDoubanReview(DoubanReview DoubanReview) {
		String queryString = "delete from DoubanReview r where r.reviewid=?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,DoubanReview.getReviewid());
		return queryObject.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanUser> findAllUser(int pageSize,int pageCode) {
		String queryString = "from DoubanUser";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanUser>) queryObject.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanReview> selectDoubanReview(DoubanUser user) {
		String queryString = "from DoubanReview r where r.reviewuser=? order by reviewtime desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,user.getUsername());
		queryObject.setFirstResult(0);
		queryObject.setMaxResults(10);
		return (ArrayList<DoubanReview>) queryObject.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovie() {
		String queryString = "from DoubanResource";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		return (ArrayList<DoubanResource>) queryObject.list();
	}

	@Override
	public int deleteActor(DoubanActor actor) {
		String queryString = "delete from DoubanActor a where a.actorid=?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,actor.getActorid());
		return queryObject.executeUpdate();
	}

	@Override
	public int deleteDirector(DoubanDirector director) {
		String queryString = "delete from DoubanDirector d where d.directorid=?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0,director.getDirectorid());
		return queryObject.executeUpdate();
	}

	@Override
	public int updateActor(DoubanActor actor) {
		this.getCurrentSession().update(actor);
		return 1;
	}

	@Override
	public int updateDirector(DoubanDirector director) {
		this.getCurrentSession().update(director);
		return 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanActor> selectActorByNameKeyword(DoubanActor actor) {
		String queryString = "from DoubanActor a where a.actorname like ?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, "%"+actor.getActorname()+"%");
		return (ArrayList<DoubanActor>) queryObject.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanDirector> selectDirectorByNameKeyword(DoubanDirector director) {
		String queryString = "from DoubanDirector d where d.directorname like ?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, "%"+director.getDirectorname()+"%");
		return (ArrayList<DoubanDirector>) queryObject.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanActor> selectActor() {
		String queryString = "from DoubanActor";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		return (ArrayList<DoubanActor>) queryObject.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanDirector> selectDirector() {
		String queryString = "from DoubanDirector";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		return (ArrayList<DoubanDirector>) queryObject.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource) {
		String queryString = "from DoubanResource m where m.moviename like ?";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, "%"+doubanResource.getMoviename()+"%");
		return (ArrayList<DoubanResource>) queryObject.list();
	}


	@Override
	public int updateMovieActor(DoubanResource resource) {
		String hql="update DoubanResource m set m.movieactorid = ? where m.movieid = ?";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setString(0,resource.getMovieactorid());
		query.setString(1, resource.getMovieid());
		return query.executeUpdate();
	}

	@Override
	public DoubanResource selectActor(DoubanResource doubanResource) {
		Criteria criteria=this.getCurrentSession().createCriteria(DoubanResource.class);
		Criterion criterion=Restrictions.eq("movieid",doubanResource.getMovieid());
		criteria.add(criterion);
		
		return (DoubanResource) criteria.uniqueResult();
	}

	@Override
	public int addMovieType(DoubanType type) {
		if(this.getCurrentSession().save(type)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanType> selectMovieType() {
		String queryString = "from DoubanType";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		return (ArrayList<DoubanType>) queryObject.list();
	}
	}
