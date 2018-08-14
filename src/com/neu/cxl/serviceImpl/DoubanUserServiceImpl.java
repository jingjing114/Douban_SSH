package com.neu.cxl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neu.cxl.dao.DoubanUserDAO;
import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanUserService;
@Transactional
@Repository("doubanUserService")
public class DoubanUserServiceImpl implements DoubanUserService{

	@Autowired
	private DoubanUserDAO doubanUserDAO;
	//注册
	public boolean register(DoubanUser doubanUser) {
		doubanUser.setRole("普通会员");
		doubanUser.setIcon("upload/userIcon/img01.jpg");
		if(this.doubanUserDAO.register(doubanUser)>0)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	//查找所有用户
	@Override
	public List<DoubanUser> FindAll() {
		
		return this.doubanUserDAO.FindAll();
	}
	//查找单个用户（登录检查）
	@Override
	public DoubanUser findDoubanUser(DoubanUser DoubanUser) {
		return this.doubanUserDAO.findDoubanUser(DoubanUser);
	}
	//检查用户名
	@Override
	public DoubanUser checkDoubanUser(DoubanUser DoubanUser) {
		return this.doubanUserDAO.checkDoubanUser(DoubanUser);
	}
	//查询用户信息
	@Override
	public DoubanUser selectDoubanUserInfo(DoubanUser DoubanUser) {
		return this.doubanUserDAO.selectDoubanUserInfo(DoubanUser);
	}
	//修改用户资料
	@Override
	public boolean updateDoubanUserInfo(DoubanUser DoubanUser) {
		if(this.doubanUserDAO.updateDoubanUserInfo(DoubanUser)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//修改密码
	@Override
	public boolean updatePassword(DoubanUser DoubanUser) {
		if(this.doubanUserDAO.updatePassword(DoubanUser)>0)
		{
		return true;
	}
		else{
		return false;
		}
		}
	@Override
	public boolean uploadIcon(DoubanUser DoubanUser) {
		if(this.doubanUserDAO.uploadIcon(DoubanUser)>0)
		{
		return true;
	}
		else{
		return false;
		}
	}
}
