package com.driver.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.*;
@Entity
@Table
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String username;
    private String  password;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Blog>blogList= new ArrayList<>();

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.firstName="test";
        this.lastName="test";
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
