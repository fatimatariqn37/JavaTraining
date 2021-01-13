package com.company.Models;

import java.util.ArrayList;

public class Doctor extends Person
{
    ArrayList<Patient> patientList;
    private int DocId;

    public Doctor(ArrayList<Patient> pl){
      patientList=new ArrayList<Patient>();
      this.patientList=pl;
    }

    public Doctor(int n){
        this.DocId=n;
    }

    public int getDocId()
    {
        return this.DocId;
    }

    public void displayPatients(){
        System.out.println(patientList);
    }

    public void setDocId(int id)
    {
        this.DocId=id;
    }


}