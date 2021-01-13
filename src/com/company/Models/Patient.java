package com.company.Models;

import java.util.ArrayList;

public class Patient extends Person{

    private int PatientID;

    public void PatientID(int n){
        this.PatientID=n;
    }

    public int getPatientID()
    {
        return this.PatientID;
    }

    public void displayAppointmentHistory(){
        System.out.println("some dates here");
    }

    public void setPatientID(int id)
    {
        this.PatientID=id;
    }

}
