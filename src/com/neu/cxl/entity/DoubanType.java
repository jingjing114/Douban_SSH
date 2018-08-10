package com.neu.cxl.entity;



/**
 * DoubanType entity. @author MyEclipse Persistence Tools
 */

public class DoubanType  implements java.io.Serializable {


    // Fields    

     private String typeid;
     private String typename;


    // Constructors

    /** default constructor */
    public DoubanType() {
    }

    
    /** full constructor */
    public DoubanType(String typename) {
        this.typename = typename;
    }

   
    // Property accessors

    public String getTypeid() {
        return this.typeid;
    }
    
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return this.typename;
    }
    
    public void setTypename(String typename) {
        this.typename = typename;
    }
   








}