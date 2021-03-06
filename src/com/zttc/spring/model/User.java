package com.zttc.spring.model;

import javax.persistence.*;

/**
 * Created by �� on 2016/1/30.
 */
@Entity
@Table(name="t_user")
public class User {
    private int id;
    private String username;
    private String password;
    private String nickname;

    private Group group;


    public User() {
    }

    public User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @ManyToOne
    @JoinColumn(name="groupid")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
