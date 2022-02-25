package com.userService.user.model;

import javax.persistence.*;
@Entity
@Table(name = "`user`")
public class userDetails {

    public userDetails(Integer id, String name, String userName, String passWord) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
    }

    public userDetails(){}

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    @Column(name = "name")
    String name;

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "username")
    String userName;

    @Column(name = "password")
    String passWord;


}
