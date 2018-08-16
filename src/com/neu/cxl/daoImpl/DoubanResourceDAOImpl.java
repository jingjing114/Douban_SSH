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

import com.neu.cxl.dao.DoubanResourceDAO;
import com.neu.cxl.entity.DoubanResource;
import com.neu.cxl.entity.DoubanType;
@Transactional
@Repository("doubanResourceDAO")
public class DoubanResourceDAOImpl implements DoubanResourceDAO{

	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	//默认查询所有电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovie(int pageSize,int pageCode) {
		
		String queryString = "from DoubanResource";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//通过ID查询电影
	@Override
	public DoubanResource selectMovieById(DoubanResource doubanResource) {
		Criteria criteria=this.getCurrentSession().createCriteria(DoubanResource.class);
		Criterion criterion=Restrictions.eq("movieid",doubanResource.getMovieid());
		criteria.add(criterion);
		
		return (DoubanResource) criteria.uniqueResult();
	}
	//通过名字关键字查询电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByNameKeyword(DoubanResource doubanResource,int pageSize,int pageCode) {
		String queryString = "from DoubanResource m where m.moviename like ? order by m.avgscore desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, "%"+doubanResource.getMoviename()+"%");
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//通过电影类型查询电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByType(DoubanResource doubanResource,int pageSize,int pageCode) {
		String queryString = "from DoubanResource m where m.movietype like ? order by m.avgscore desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, "%"+doubanResource.getMovietype()+"%");
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//通过电影年份查询电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByYear(DoubanResource doubanResource,int pageSize,int pageCode) {
		String queryString = "from DoubanResource m where m.movieyear like ? order by m.avgscore desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, "%"+doubanResource.getMovieyear()+"%");
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//通过电影评分查询高于此评分的电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByScore(DoubanResource doubanResource,int pageSize,int pageCode) {
		String queryString = "from DoubanResource m where m.avgscore > ?  order by m.avgscore desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setFloat(0, doubanResource.getAvgscore());
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//通过演员查询电影
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieByActor(DoubanResource doubanResource,int pageSize,int pageCode) {
		String queryString = "from DoubanResource m where m.movieactorid like ? order by m.avgscore desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setString(0, "%"+doubanResource.getMovieactorid()+"%");
		queryObject.setFirstResult((pageCode-1)*pageSize);
		queryObject.setMaxResults(pageSize);
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//高分推荐
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieSortByScore() {
		
		String queryString = "from DoubanResource where avgscore>9 order by acgscore desc ";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//热度排行榜
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanResource> selectMovieSortByReviewNum() {
		
		String queryString = "from DoubanResource order by moviereviewnumber desc";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		queryObject.setFirstResult(0);
		queryObject.setMaxResults(10);
		return (ArrayList<DoubanResource>) queryObject.list();
	}
	//查询电影类型
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DoubanType> selectMovieType() {
		String queryString = "from DoubanType";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		return (ArrayList<DoubanType>) queryObject.list();
	}
	
}
