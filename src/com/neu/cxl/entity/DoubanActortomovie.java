package com.neu.cxl.entity;



/**
 * DoubanActortomovie entity. @author MyEclipse Persistence Tools
 */

public class DoubanActortomovie  implements java.io.Serializable {


    // Fields    

     private String correspondenceid;
     private String actorid;
     private String movieid;


    // Constructors

    /** default constructor */
    public DoubanActortomovie() {
    }

    
    /** full constructor */
    public DoubanActortomovie(String actorid, String movieid) {
        this.actorid = actorid;
        this.movieid = movieid;
    }

   
    // Property accessors

    public String getCorrespondenceid() {
        return this.correspondenceid;
    }
    
    public void setCorrespondenceid(String correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getActorid() {
        return this.actorid;
    }
    
    public void setActorid(String actorid) {
        this.actorid = actorid;
    }

    public String getMovieid() {
        return this.movieid;
    }
    
    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }
   








}