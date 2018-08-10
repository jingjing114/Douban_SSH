package com.neu.cxl.entity;



/**
 * DoubanActor entity. @author MyEclipse Persistence Tools
 */

public class DoubanActor  implements java.io.Serializable {


    // Fields    

     private String actorid;
     private String actorname;
     private String actorintroduction;
     private String actorsex;
     private String actorsign;
     private String actorbirthday;
     private String actorwork;
     private String actorborned;
     private String actorphoto;


    // Constructors

    /** default constructor */
    public DoubanActor() {
    }

    
    /** full constructor */
    public DoubanActor(String actorname, String actorintroduction, String actorsex, String actorsign, String actorbirthday, String actorwork, String actorborned, String actorphoto) {
        this.actorname = actorname;
        this.actorintroduction = actorintroduction;
        this.actorsex = actorsex;
        this.actorsign = actorsign;
        this.actorbirthday = actorbirthday;
        this.actorwork = actorwork;
        this.actorborned = actorborned;
        this.actorphoto = actorphoto;
    }

   
    // Property accessors

    public String getActorid() {
        return this.actorid;
    }
    
    public void setActorid(String actorid) {
        this.actorid = actorid;
    }

    public String getActorname() {
        return this.actorname;
    }
    
    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public String getActorintroduction() {
        return this.actorintroduction;
    }
    
    public void setActorintroduction(String actorintroduction) {
        this.actorintroduction = actorintroduction;
    }

    public String getActorsex() {
        return this.actorsex;
    }
    
    public void setActorsex(String actorsex) {
        this.actorsex = actorsex;
    }

    public String getActorsign() {
        return this.actorsign;
    }
    
    public void setActorsign(String actorsign) {
        this.actorsign = actorsign;
    }

    public String getActorbirthday() {
        return this.actorbirthday;
    }
    
    public void setActorbirthday(String actorbirthday) {
        this.actorbirthday = actorbirthday;
    }

    public String getActorwork() {
        return this.actorwork;
    }
    
    public void setActorwork(String actorwork) {
        this.actorwork = actorwork;
    }

    public String getActorborned() {
        return this.actorborned;
    }
    
    public void setActorborned(String actorborned) {
        this.actorborned = actorborned;
    }

    public String getActorphoto() {
        return this.actorphoto;
    }
    
    public void setActorphoto(String actorphoto) {
        this.actorphoto = actorphoto;
    }
   








}