package com.neu.cxl.entity;



/**
 * DoubanDirectortomovie entity. @author MyEclipse Persistence Tools
 */

public class DoubanDirectortomovie  implements java.io.Serializable {


    // Fields    

     private Integer correspondenceid;
     private String movieid;
     private String directorid;


    // Constructors

    /** default constructor */
    public DoubanDirectortomovie() {
    }

    
    /** full constructor */
    public DoubanDirectortomovie(String movieid, String directorid) {
        this.movieid = movieid;
        this.directorid = directorid;
    }

   
    // Property accessors

    public Integer getCorrespondenceid() {
        return this.correspondenceid;
    }
    
    public void setCorrespondenceid(Integer correspondenceid) {
        this.correspondenceid = correspondenceid;
    }

    public String getMovieid() {
        return this.movieid;
    }
    
    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getDirectorid() {
        return this.directorid;
    }
    
    public void setDirectorid(String directorid) {
        this.directorid = directorid;
    }
   








}