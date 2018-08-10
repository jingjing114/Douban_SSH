package com.neu.cxl.entity;



/**
 * DoubanUser entity. @author MyEclipse Persistence Tools
 */

public class DoubanUser  implements java.io.Serializable {


    // Fields    

     private String userid;
     private String username;
     private String password;
     private String sex;
     private String age;
     private String phone;
     private String email;
     private String introduction;
     private String role;
     private String review;
     private String icon;


    // Constructors

    /** default constructor */
    public DoubanUser() {
    }

	/** minimal constructor */
    public DoubanUser(String username) {
        this.username = username;
    }
    
    /** full constructor */
    public DoubanUser(String username, String password, String sex, String age, String phone, String email, String introduction, String role, String review, String icon) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.introduction = introduction;
        this.role = role;
        this.review = review;
        this.icon = icon;
    }

   
    // Property accessors

    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return this.age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntroduction() {
        return this.introduction;
    }
    
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getReview() {
        return this.review;
    }
    
    public void setReview(String review) {
        this.review = review;
    }

    public String getIcon() {
        return this.icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
   








}