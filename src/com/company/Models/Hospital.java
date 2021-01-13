package com.company.Models;

import java.util.ArrayList;

public class Hospital {


    ArrayList<Patient> doctorList;

    public Hospital(ArrayList<Patient> pl){
        doctorList=new ArrayList<Patient>();
        this.doctorList=pl;
    }

    public Hospital(){

    }



    public void displayDoctors(){
        System.out.println(doctorList);
    }



}
