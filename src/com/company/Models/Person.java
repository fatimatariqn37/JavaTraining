package com.company.Models;

public class Person {

    private String fname;
    private String lname;
    Person(){

    }
    Person(String a,String b){

    }


    public String getFname()
    {
        return fname;
    }


    public String getLname()
    {
        return lname;
    }


    public void setFname(String f)
    {
        this.fname=f;
    }


    public void setLname(String l)
    {
        this.lname=l;
    }


}
