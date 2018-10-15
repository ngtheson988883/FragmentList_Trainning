package com.example.nguyentheson.fragmentlist_trainning;

import java.io.Serializable;

public class Student implements Serializable{
    String name;
    int birth_year;
    String address, email;

    public Student() {
    }

    public Student(String name, int birth_year, String address, String email) {
        this.name = name;
        this.birth_year = birth_year;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birth_year=" + birth_year +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
