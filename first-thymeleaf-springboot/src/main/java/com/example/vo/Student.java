package com.example.vo;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private School mySchool;

    public Integer getId() {
        return id;
    }

    public School getMySchool() {
        return mySchool;
    }

    public void setMySchool(School mySchool) {
        this.mySchool = mySchool;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
