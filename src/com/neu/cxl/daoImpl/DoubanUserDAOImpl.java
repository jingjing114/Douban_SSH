package com.neu.cxl.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanUserDAO;
import com.neu.cxl.entity.DoubanUser;


@Transactional
@Repository("doubanUserDAO")
public class DoubanUserDAOImpl implements DoubanUserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int register(DoubanUser DoubanUser) {
		
		if(this.getCurrentSession().save(DoubanUser)!=null)
		{
		return 1;
		}else
		{
			return 0;
		}
	}

	@Override
	public DoubanUser findDoubanUser(DoubanUser DoubanUser) {
		Criteria criteria=this.getCurrentSession().createCriteria(DoubanUser.class);
		Criterion criterion=Restrictions.eq("username",DoubanUser.getUsername());
		Criterion criterion1=Restrictions.eq("password",DoubanUser.getPassword());
		criteria.add(criterion);
		criteria.add(criterion1);
		return (com.neu.cxl.entity.DoubanUser) criteria.uniqueResult();
	}

	@Override
	public DoubanUser checkDoubanUser(DoubanUser DoubanUser) {
		Criteria criteria=this.getCurrentSession().createCriteria(DoubanUser.class);
		Criterion criterion=Restrictions.eq("username",DoubanUser.getUsername());
		criteria.add(criterion);
		
		return (com.neu.cxl.entity.DoubanUser) criteria.uniqueResult();
	}

	@Override
	public DoubanUser selectDoubanUserInfo(DoubanUser DoubanUser) {
		
		Criteria criteria=this.getCurrentSession().createCriteria(DoubanUser.class);
		Criterion criterion=Restrictions.eq("username",DoubanUser.getUsername());
		
		criteria.add(criterion);
		
		return (com.neu.cxl.entity.DoubanUser) criteria.uniqueResult();
	}

	@Override
	public int updateDoubanUserInfo(DoubanUser DoubanUser) {
		this.getCurrentSession().update(DoubanUser);
		return 1;
	}

	@Override
	public int updatePassword(DoubanUser DoubanUser) {
		String hql="update DoubanUser u set u.password = ? where u.username = ?";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setString(0, DoubanUser.getPassword());
		query.setString(1, DoubanUser.getUsername());
		return query.executeUpdate();
		

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DoubanUser> FindAll() {
		String queryString = "from DoubanUser";
		Query queryObject = this.getCurrentSession().createQuery(queryString);
		return queryObject.list();
	}

	@Override
	public int uploadIcon(DoubanUser DoubanUser) {
		String hql="update DoubanUser u set u.icon = ? where u.username = ?";
		Query query = this.getCurrentSession().createQuery(hql);
		query.setString(0, DoubanUser.getIcon());
		query.setString(1, DoubanUser.getUsername());
		return query.executeUpdate();
	}

	@Override
	public DoubanUser checkDoubanUserPhone(DoubanUser DoubanUser) {
		
			Criteria criteria=this.getCurrentSession().createCriteria(DoubanUser.class);
			Criterion criterion=Restrictions.eq("phone",DoubanUser.getPhone());
			criteria.add(criterion);
			
			return (com.neu.cxl.entity.DoubanUser) criteria.uniqueResult();
		}
	
	

	
}
