package com.example.macbook.myrecviewapp;



public class PersonModel {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private boolean sex;
    private String imgUrl;

    public PersonModel(String name, String surname, String email, String phone, boolean sex, String imgUrl) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
