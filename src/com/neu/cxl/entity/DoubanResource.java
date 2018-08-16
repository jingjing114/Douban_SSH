package com.neu.cxl.entity;



/**
 * DoubanResource entity. @author MyEclipse Persistence Tools
 */

public class DoubanResource  implements java.io.Serializable {


    // Fields    

     private String movieid;
     private String moviename;
     private Float avgscore;
     private String movietype;
     private String movieactorid;
     private String movieimgurl;
     private Integer moviereviewnumber;
     private String moviedescription;
     private String moviearea;
     private String movieyear;
     private String moviedirectorid;
     private String movietime;
     private String movielanguage;
     private String movieurl;


    // Constructors

    /** default constructor */
    public DoubanResource() {
    }

    
    /** full constructor */
    public DoubanResource(String moviename, Float avgscore, String movietype, String movieactorid, String movieimgurl, Integer moviereviewnumber, String moviedescription, String moviearea, String movieyear, String moviedirectorid, String movietime, String movielanguage, String movieurl) {
        this.moviename = moviename;
        this.avgscore = avgscore;
        this.movietype = movietype;
        this.movieactorid = movieactorid;
        this.movieimgurl = movieimgurl;
        this.moviereviewnumber = moviereviewnumber;
        this.moviedescription = moviedescription;
        this.moviearea = moviearea;
        this.movieyear = movieyear;
        this.moviedirectorid = moviedirectorid;
        this.movietime = movietime;
        this.movielanguage = movielanguage;
        this.movieurl = movieurl;
    }

   
    // Property accessors

    public String getMovieid() {
        return this.movieid;
    }
    
    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return this.moviename;
    }
    
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public Float getAvgscore() {
        return this.avgscore;
    }
    
    public void setAvgscore(Float avgscore) {
        this.avgscore = avgscore;
    }

    public String getMovietype() {
        return this.movietype;
    }
    
    public void setMovietype(String movietype) {
        this.movietype = movietype;
    }

    public String getMovieactorid() {
        return this.movieactorid;
    }
    
    public void setMovieactorid(String movieactorid) {
        this.movieactorid = movieactorid;
    }

    public String getMovieimgurl() {
        return this.movieimgurl;
    }
    
    public void setMovieimgurl(String movieimgurl) {
        this.movieimgurl = movieimgurl;
    }

    public Integer getMoviereviewnumber() {
        return this.moviereviewnumber;
    }
    
    public void setMoviereviewnumber(Integer moviereviewnumber) {
        this.moviereviewnumber = moviereviewnumber;
    }

    public String getMoviedescription() {
        return this.moviedescription;
    }
    
    public void setMoviedescription(String moviedescription) {
        this.moviedescription = moviedescription;
    }

    public String getMoviearea() {
        return this.moviearea;
    }
    
    public void setMoviearea(String moviearea) {
        this.moviearea = moviearea;
    }

    public String getMovieyear() {
        return this.movieyear;
    }
    
    public void setMovieyear(String movieyear) {
        this.movieyear = movieyear;
    }

    public String getMoviedirectorid() {
        return this.moviedirectorid;
    }
    
    public void setMoviedirectorid(String moviedirectorid) {
        this.moviedirectorid = moviedirectorid;
    }

    public String getMovietime() {
        return this.movietime;
    }
    
    public void setMovietime(String movietime) {
        this.movietime = movietime;
    }

    public String getMovielanguage() {
        return this.movielanguage;
    }
    
    public void setMovielanguage(String movielanguage) {
        this.movielanguage = movielanguage;
    }

    public String getMovieurl() {
        return this.movieurl;
    }
    
    public void setMovieurl(String movieurl) {
        this.movieurl = movieurl;
    }
   








}