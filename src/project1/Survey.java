/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.Serializable;

/**
 *
 * @author x17444592
 */
public class Survey implements Serializable{
    protected String name;
    protected String hType;
    protected double hPay;
    protected String Hloc;
    protected int crimeL;
    protected int bAmount;
    protected String factors;
    protected boolean visit;
    protected int rating;

    public Survey(){
         name="";
         hType="";
         hPay=0;
         Hloc="";
         crimeL=0;
         bAmount=0;
         factors="";
         visit=false;
         rating=0; 
     }
    //This is an overloaded constructor (added functionality makes instatiating easier)

    public Survey(String name, String hType, double hPay, String Hloc, int crimeL, int bAmount, String factors, boolean visit, int rating) {
        this.name = name;
        this.hType = hType;
        this.hPay = hPay;
        this.Hloc = Hloc;
        this.crimeL = crimeL;
        this.bAmount = bAmount;
        this.factors = factors;
        this.visit = visit;
        this.rating = rating;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String gethType() {
        return hType;
    }

    public void sethType(String hType) {
        this.hType = hType;
    }

    public double gethPay() {
        return hPay;
    }

    public void sethPay(double hPay) {
        this.hPay = hPay;
    }

    public String getHloc() {
        return Hloc;
    }

    public void setHloc(String Hloc) {
        this.Hloc = Hloc;
    }

    public int getCrimeL() {
        return crimeL;
    }

    public void setCrimeL(int crimeL) {
        this.crimeL = crimeL;
    }

    public int getbAmount() {
        return bAmount;
    }

    public void setbAmount(int bAmount) {
        this.bAmount = bAmount;
    }

    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
}
