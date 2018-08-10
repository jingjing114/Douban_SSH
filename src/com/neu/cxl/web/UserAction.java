package com.neu.cxl.web;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.neu.cxl.Utils.Utils;
import com.neu.cxl.entity.DoubanUser;
import com.neu.cxl.service.DoubanUserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	@Autowired
	private DoubanUserService doubanUserService;
	
	private DoubanUser user;
	private String code;
	public DoubanUser getUser() {
		return user;
	}
	

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public void setUser(DoubanUser user) {
		this.user = user;
	}



//注册
	public void register() throws IOException
	{
		HttpServletResponse response=ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		response.setContentType("text/html;charset=utf-8");
	
		PrintWriter out=response.getWriter();
		
		if(!Pattern.matches("^1[3|5|8]\\d{9}$", user.getPhone()))
		{
			out.print("手机号码格式有误");
			
			return;
		}
		HttpSession session=request.getSession();
	    String sessioncode=(String) session.getAttribute("code");
		String number=(String) session.getAttribute("number");
		Long time=(Long) session.getAttribute("time");
		this.code=request.getParameter("verifycode");
		//System.out.println(code+sessioncode);
		session.removeAttribute("code");
		session.removeAttribute("number");
		session.removeAttribute("time");
		
		/*if(!number.trim().equalsIgnoreCase(number))
		{
			
		}*/
		//System.out.println(sessioncode+"   "+code );
		if(sessioncode==null)
		{
			sessioncode="";
		}
		if(sessioncode.trim().equalsIgnoreCase(code))
		{
			response.addHeader("Content-Type", "text/html;charset=utf-8");
			
			
				if(this.doubanUserService.register(user))
				{
					response.getWriter().write("<script languge='javascript'>alert('注册成功'); window.location.href='login.jsp';</script>");
					//request.getRequestDispatcher("login.html").forward(request, response);
				}
				else
				{
					response.getWriter().write("<script languge='javascript'>alert('注册失败'); window.location.href='register.jsp';</script>");
				}
		
			
		}
		else
		{
			response.getWriter().write("<script languge='javascript'>alert('验证码错误！'); window.location.href='register.jsp';</script>");
			//response.sendRedirect("register.html");
			return;
		}
		

			
	}
//查看所有用户	
	public String findAll()
	{
		List <DoubanUser> list=this.doubanUserService.FindAll();
		 HttpServletRequest request = ServletActionContext.getRequest();
	        request.setAttribute("list", list);
	        return "select";
	}

//发送注册验证码
	public void code() throws IOException
	{
		HttpServletResponse response=ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		response.setContentType("text/html;charset=utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out=response.getWriter();
		if(user.getPhone().trim().equals("")||user.getPhone()==null)
		{
			//response.sendRedirect("register.html");
			out.println("手机号码不能为空");
			return;
		}
		if(!Pattern.matches("^1[3|5|8]\\d{9}$", user.getPhone()))
		{
			//response.sendRedirect("register.html");
			out.println("手机号码格式有误");
			return;
		}
		StringBuffer buffer=new StringBuffer();
		Random random=new Random();
		for(int i=0;i<6;i++)
		{
			buffer.append(random.nextInt(10));
		}
		response.setContentType("text/html;charset=utf-8");
		
		if(!Utils.sendcode(user.getPhone(), buffer.toString()))
		{
			out.println("验证码发送失败");
			
		}
		else
		{
			request.getSession().setAttribute("code", buffer.toString());
			request.getSession().setAttribute("number", user.getPhone());
			request.getSession().setAttribute("time", System.currentTimeMillis());
			out.println("验证码发送成功");
			
		}
		out.close();
		}
	

	
//登录
	public String  login() 
	{
		if(this.doubanUserService.findDoubanUser(user)!=null)
		{
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "main";
		}
		else
		{
			ActionContext.getContext().put("msg", "用户名或密码错误！");
			return "login";
		}
		
	}
//检查用户名
	public void checkDoubanUser() throws IOException 
	{
		
		if(this.doubanUserService.checkDoubanUser(user)==null)
		{
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("用户名可以使用");
			
		}
		else
		{
			HttpServletResponse response=ServletActionContext.getResponse();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print("用户名已被占用");
			
		}
		
	}
//查看个人资料
	public String  selectDoubanUserInfo() 
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("user",this.doubanUserService.selectDoubanUserInfo(user));
		return "single";
	}
//修改个人资料
	public String updateDoubanUserInfo() throws IOException
	{
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		if(this.doubanUserService.updateDoubanUserInfo(user))
		 {
     	   request.getSession().setAttribute("user", user);
     	  response.getWriter().write("<script languge='javascript'>alert('修改成功');</script>");
			}
			else
			{
				response.getWriter().write("<script languge='javascript'>alert('修改失败'); ;</script>");
			}
		
		return "single";
	}
//修改密码
	public void updatePassword() throws IOException
	{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.addHeader("Content-Type", "text/html;charset=utf-8");
		if( this.doubanUserService.updatePassword(user))
		
			{
				response.getWriter().write("<script languge='javascript'>alert('密码重置成功，请重新登录'); window.location.href='login.jsp';</script>");
			}
			else
			{
				response.getWriter().write("<script languge='javascript'>alert('密码重置失败'); window.location.href='passswordchange.html';</script>");
			}
		
	}
//注销
	public String logout()
	{
		ServletActionContext.getRequest().getSession().removeAttribute("user");
		return "login";
	}

}
