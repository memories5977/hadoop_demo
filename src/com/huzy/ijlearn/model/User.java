package com.huzy.ijlearn.model;

/**
 * Created by Administrator on 2017/10/27.
 */
public class User {
    private int id;
    private String name;
    private int age;
    private int groupId;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User user = new User("张三",12);
        System.out.println(user.name);
    }
}
