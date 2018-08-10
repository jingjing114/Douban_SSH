package com.neu.cxl.dao;

import java.util.List;

import com.neu.cxl.entity.DoubanUser;


public interface DoubanUserDAO {

	
	public int register(DoubanUser DoubanUser) ;
	public DoubanUser findDoubanUser(DoubanUser DoubanUser) ;
	public DoubanUser checkDoubanUser(DoubanUser DoubanUser) ;
	public DoubanUser selectDoubanUserInfo(DoubanUser DoubanUser) ;
	public int updateDoubanUserInfo(DoubanUser DoubanUser);
	public int uploadIcon(DoubanUser DoubanUser);
	public int updatePassword(DoubanUser DoubanUser);
	public List<DoubanUser> FindAll();
	
	
	
	
	
	
}
