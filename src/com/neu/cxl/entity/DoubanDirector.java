package com.neu.cxl.entity;



/**
 * DoubanDirector entity. @author MyEclipse Persistence Tools
 */

public class DoubanDirector  implements java.io.Serializable {


    // Fields    

     private String directorid;
     private String directorname;
     private String directorintroduction;
     private String directorsex;
     private String directorsign;
     private String directorbirthday;
     private String directorwork;
     private String directorborned;
     private String directorphoto;


    // Constructors

    /** default constructor */
    public DoubanDirector() {
    }

    
    /** full constructor */
    public DoubanDirector(String directorname, String directorintroduction, String directorsex, String directorsign, String directorbirthday, String directorwork, String directorborned, String directorphoto) {
        this.directorname = directorname;
        this.directorintroduction = directorintroduction;
        this.directorsex = directorsex;
        this.directorsign = directorsign;
        this.directorbirthday = directorbirthday;
        this.directorwork = directorwork;
        this.directorborned = directorborned;
        this.directorphoto = directorphoto;
    }

   
    // Property accessors

    public String getDirectorid() {
        return this.directorid;
    }
    
    public void setDirectorid(String directorid) {
        this.directorid = directorid;
    }

    public String getDirectorname() {
        return this.directorname;
    }
    
    public void setDirectorname(String directorname) {
        this.directorname = directorname;
    }

    public String getDirectorintroduction() {
        return this.directorintroduction;
    }
    
    public void setDirectorintroduction(String directorintroduction) {
        this.directorintroduction = directorintroduction;
    }

    public String getDirectorsex() {
        return this.directorsex;
    }
    
    public void setDirectorsex(String directorsex) {
        this.directorsex = directorsex;
    }

    public String getDirectorsign() {
        return this.directorsign;
    }
    
    public void setDirectorsign(String directorsign) {
        this.directorsign = directorsign;
    }

    public String getDirectorbirthday() {
        return this.directorbirthday;
    }
    
    public void setDirectorbirthday(String directorbirthday) {
        this.directorbirthday = directorbirthday;
    }

    public String getDirectorwork() {
        return this.directorwork;
    }
    
    public void setDirectorwork(String directorwork) {
        this.directorwork = directorwork;
    }

    public String getDirectorborned() {
        return this.directorborned;
    }
    
    public void setDirectorborned(String directorborned) {
        this.directorborned = directorborned;
    }

    public String getDirectorphoto() {
        return this.directorphoto;
    }
    
    public void setDirectorphoto(String directorphoto) {
        this.directorphoto = directorphoto;
    }
   








}