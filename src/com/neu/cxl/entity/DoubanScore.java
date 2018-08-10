package com.neu.cxl.entity;



/**
 * DoubanScore entity. @author MyEclipse Persistence Tools
 */

public class DoubanScore  implements java.io.Serializable {


    // Fields    

     private String scoreid;
     private String score;


    // Constructors

    /** default constructor */
    public DoubanScore() {
    }

    
    /** full constructor */
    public DoubanScore(String score) {
        this.score = score;
    }

   
    // Property accessors

    public String getScoreid() {
        return this.scoreid;
    }
    
    public void setScoreid(String scoreid) {
        this.scoreid = scoreid;
    }

    public String getScore() {
        return this.score;
    }
    
    public void setScore(String score) {
        this.score = score;
    }
   








}