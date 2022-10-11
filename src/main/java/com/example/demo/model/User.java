package com.example.demo.model;



public class User {
    private int id;//id
    private String name ;//name
    private String address; //address
    private int postcode; // postcode
    private int age; //age
    private String job; //job
    private String email; //email
    private int phoneNo; //PhoneNO

    public User(int id , String name,String address,int postcode,int age,String job,String email,int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.age = age;
        this.job = job;
        this.email = email;
        this.phoneNo = phoneNo;
    }


    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getPostcode(){
        return postcode;
    }
    public int getAge(){
        return age;
    }
    public String getJob(){
        return job;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNo(){
        return phoneNo;
    }
}


