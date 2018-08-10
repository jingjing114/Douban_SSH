package com.neu.cxl.daoImpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMovie(DoubanResource DoubanResource) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addActor(DoubanActor actor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addDirector(DoubanDirector director) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addMovie(DoubanResource DoubanResource) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCorrespondence(DoubanActortomovie at) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCorrespondence(DoubanDirectortomovie dt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDoubanReview(DoubanReview DoubanReview) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<DoubanUser> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DoubanReview> selectDoubanReview(DoubanUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DoubanResource> selectMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteActor(DoubanActor actor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDirector(DoubanDirector director) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateActor(DoubanActor actor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDirector(DoubanDirector director) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<DoubanActor> selectActorByNameKeyword(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DoubanDirector> selectDirectorByNameKeyword(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DoubanActor> selectActor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DoubanDirector> selectDirector() {
		// TODO Auto-generated method stub
		return null;
	}

}
