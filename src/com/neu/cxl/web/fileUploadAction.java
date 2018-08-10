package com.neu.cxl.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanUserService;
import com.opensymphony.xwork2.ActionSupport;

public class fileUploadAction extends ActionSupport{
	@Autowired
	private DoubanUserService doubanUserService;
	
	private DoubanUser user;
	public DoubanUser getUser() {
		return user;
	}
	
	public void setUser(DoubanUser user) {
		this.user = user;
	}
	
	
	private File myfile;
	private String myfileFileName;
	private String myfileContentType;
	
	
	public File getMyfile() {
		return myfile;
	}


	public void setMyfile(File myfile) {
		this.myfile = myfile;
	}


	public String getMyfileFileName() {
		return myfileFileName;
	}


	public void setMyfileFileName(String myfileFileName) {
		this.myfileFileName = myfileFileName;
	}


	public String getMyfileContentType() {
		return myfileContentType;
	}


	public void setMyfileContentType(String myfileContentType) {
		this.myfileContentType = myfileContentType;
	}



	
	
	public void upload() throws IOException
	{
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		if(myfile==null)
		{
			response.getWriter().write("<script languge='javascript'>alert('修改成功');</script>");
			return;
		}
		String path=ServletActionContext.getServletContext().getRealPath("/upload");
		File file=new File(path);
		if(!file.exists())
		{
			file.mkdirs();
		}
		
			FileUtils.copyFile(myfile,new File(file,this.myfileFileName));
		
		user.setIcon("upload/"+this.myfileFileName);

		if(this.doubanUserService.uploadIcon(user))
		 {
     	  request.getSession().setAttribute("user", user);
     	  response.getWriter().write("<script languge='javascript'>alert('修改成功');</script>");
     	  
			}
			else
			{
				response.getWriter().write("<script languge='javascript'>alert('修改失败'); ;</script>");
				
			}
		
		
		
	
	}

}
