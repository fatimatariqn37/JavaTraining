package com.company;

import com.company.Interfaces.IRepository;
import com.company.Models.Doctor;
import com.company.Models.Patient;
import com.company.Repository.BaseRepository;
import com.company.Util.CurrencyFormatter;
import com.company.Util.DateFormatter;

import java.text.NumberFormat;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        CurrencyFormatter cur = new CurrencyFormatter();

        cur.currencyFormatter(77867886);
        System.out.println("  ");

        System.out.println("--------------------------------------");



        DateFormatter d = new DateFormatter();
        d.printDate();
        System.out.println("  ");
        System.out.println("--------------------------------------");

        Doctor doc=new Doctor(1);
        doc.setFname("fatima");
        doc.setLname("tariq");
        doc.setDocId(1);


        Patient patient=new Patient();
        patient.setFname("fatima");
        patient.setLname("tariq");
        patient.setPatientID(1);



        Doctor emp2=new Doctor(2);
        emp2.setFname("atima");
        emp2.setLname("ariq");
        emp2.setDocId(2);

        IRepository<Doctor> repo=new BaseRepository<Doctor>();

        try{
            repo.Add(doc);
        }catch(Exception e){System.out.println("exception handled");}


        try{
            repo.Add(emp2);
        }catch(Exception e){System.out.println("exception handled");}



        Collection<Doctor> arr=repo.Retrieve();
        for(Doctor e : arr){
            System.out.println(e.getFname());
        }






    }
}
