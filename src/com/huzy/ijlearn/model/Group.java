package com.huzy.ijlearn.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/28.
 */
public class Group {
    private int id;
    private String name;
    private List<User> userList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
