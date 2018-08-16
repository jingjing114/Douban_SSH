package com.neu.cxl.service;

import java.util.List;

import com.neu.cxl.entity.DoubanUser;

public interface DoubanUserService {
	public boolean register(DoubanUser user);
	public DoubanUser findDoubanUser(DoubanUser DoubanUser) ;
	public DoubanUser checkDoubanUser(DoubanUser DoubanUser) ;
	public DoubanUser selectDoubanUserInfo(DoubanUser DoubanUser) ;
	public boolean uploadIcon(DoubanUser DoubanUser);
	public boolean updateDoubanUserInfo(DoubanUser DoubanUser);
	public boolean updatePassword(DoubanUser DoubanUser);
	public List<DoubanUser> FindAll();
	public DoubanUser checkDoubanUserPhone(DoubanUser DoubanUser);
}
