package com.neu.cxl.entity;



/**
 * DoubanReview entity. @author MyEclipse Persistence Tools
 */

public class DoubanReview  implements java.io.Serializable {


    // Fields    

     private String reviewid;
     private String reviewuser;
     private String reviewcontent;
     private String reviewmovieid;
     private Integer reviewgoodcount;
     private String reviewtime;
     private String reviewmoviename;
     private String reviewscore;


    // Constructors

    /** default constructor */
    public DoubanReview() {
    }

    
    /** full constructor */
    public DoubanReview(String reviewuser, String reviewcontent, String reviewmovieid, Integer reviewgoodcount, String reviewtime, String reviewmoviename, String reviewscore) {
        this.reviewuser = reviewuser;
        this.reviewcontent = reviewcontent;
        this.reviewmovieid = reviewmovieid;
        this.reviewgoodcount = reviewgoodcount;
        this.reviewtime = reviewtime;
        this.reviewmoviename = reviewmoviename;
        this.reviewscore = reviewscore;
    }

   
    // Property accessors

    public String getReviewid() {
        return this.reviewid;
    }
    
    public void setReviewid(String reviewid) {
        this.reviewid = reviewid;
    }

    public String getReviewuser() {
        return this.reviewuser;
    }
    
    public void setReviewuser(String reviewuser) {
        this.reviewuser = reviewuser;
    }

    public String getReviewcontent() {
        return this.reviewcontent;
    }
    
    public void setReviewcontent(String reviewcontent) {
        this.reviewcontent = reviewcontent;
    }

    public String getReviewmovieid() {
        return this.reviewmovieid;
    }
    
    public void setReviewmovieid(String reviewmovieid) {
        this.reviewmovieid = reviewmovieid;
    }

    public Integer getReviewgoodcount() {
        return this.reviewgoodcount;
    }
    
    public void setReviewgoodcount(Integer reviewgoodcount) {
        this.reviewgoodcount = reviewgoodcount;
    }

    public String getReviewtime() {
        return this.reviewtime;
    }
    
    public void setReviewtime(String reviewtime) {
        this.reviewtime = reviewtime;
    }

    public String getReviewmoviename() {
        return this.reviewmoviename;
    }
    
    public void setReviewmoviename(String reviewmoviename) {
        this.reviewmoviename = reviewmoviename;
    }

    public String getReviewscore() {
        return this.reviewscore;
    }
    
    public void setReviewscore(String reviewscore) {
        this.reviewscore = reviewscore;
    }
   








}