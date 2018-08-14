package com.neu.cxl.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Page<T> {
private int pageCode=1;//当前页码
private int totalPage;//总页数
private int totalRecord;//总记录数
private int pageSize=12;//每页记录数
private String pageType="爱情";//记录电影类型
private String movieRadio="avgscore";//电影排序方式
private  ArrayList<DoubanResource> movieList=new ArrayList<DoubanResource>();//总列表
public ArrayList<DoubanResource> getMovieList() {
	return movieList;
}
public void setMovieList(ArrayList<DoubanResource> movieList) {
	this.movieList = movieList;
}
public String getPageType() {
	return pageType;
}
public void setPageType(String pageType) {
	pageCode=1;
	if(pageType==null||"".equals(pageType))
	{}
	else
	{
	this.pageType = pageType;
	}
}
public String getMovieRadio() {
	return movieRadio;
}
public void setMovieRadio(String movieRadio) {
	pageCode=1;
	if(movieRadio==null||"".equals(movieRadio))
	{}
	else
	{
	this.movieRadio = movieRadio;}
}

private List<T> beanList;//当前页记录
public int getPageCode() {
	return pageCode;
}
public void setPageCode(int pagCode) {
	
	this.pageCode = pagCode;
}
public int getTotalPage() {
	totalPage=totalRecord/pageSize;
	return totalRecord%pageSize==0?totalPage:totalPage+1;
}
/*public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}*/
public int getTotalRecord() {
	return totalRecord;
}
public void setTotalRecord(int totalRecord) {
	this.totalRecord = totalRecord;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public List<T> getBeanList() {
	return beanList;
}
public void setBeanList(List<T> beanList) {
	this.beanList = beanList;
}

public ArrayList<T> pagingDevice(ArrayList<T> movieList){
	ArrayList<T> tempList=new ArrayList<T>();
	//this.movieList=(ArrayList<DoubanResource>) movieList;
	for(int i=0;i<pageSize;i++)
	{
		tempList.add(movieList.get(pageSize*(pageCode-1)+i));
	}
	return tempList;
}
public ArrayList<DoubanResource> sortByYear(ArrayList<DoubanResource> movieList){
	YEAR temp=new YEAR();
	 Collections.sort(movieList,temp);
    return movieList;
}

public ArrayList<DoubanResource> sortByScore(ArrayList<DoubanResource> movieList){
	Score1 temp=new Score1();
	 Collections.sort(movieList,temp);
    return movieList;
}

public ArrayList<DoubanResource> sortByMovieReviewNumber(ArrayList<DoubanResource> movieList){
	ViewNum temp=new ViewNum();
	 Collections.sort(movieList,temp);
    return movieList;
}
public  ArrayList<DoubanResource> sort(String sort){
	
	if(sort.equals("moviereviewnumber"))
		movieList=sortByMovieReviewNumber(movieList);
	else if(sort.equals("movieyear"))
		movieList=sortByYear(movieList);
	else
		if(sort.equals("avgscore"))
		movieList=sortByScore(movieList);
	return movieList;	
}
}
class YEAR implements Comparator<Object>{ 

    public int compare(Object o1,Object o2) { 
    	DoubanResource s2 = (DoubanResource) o1;
    	DoubanResource s1 = (DoubanResource) o2;
 return s1.getMovieyear().compareTo(s2.getMovieyear()); 
    } 
}
class Score1 implements Comparator<Object>{ 

    public int compare(Object o1,Object o2) { 
    	DoubanResource s2 = (DoubanResource) o1;
    	DoubanResource s1 = (DoubanResource) o2;
 return s1.getAvgscore().compareTo(s2.getAvgscore()); 
    } 
}
class ViewNum implements Comparator<Object>{ 

    public int compare(Object o1,Object o2) { 
    	DoubanResource s2 = (DoubanResource) o1;
    	DoubanResource s1 = (DoubanResource) o2;
return s1.getMoviereviewnumber().compareTo(s2.getMoviereviewnumber()); 
    } 
}