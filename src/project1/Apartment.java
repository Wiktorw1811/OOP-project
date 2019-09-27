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
public class Apartment extends Survey implements Serializable{
    protected String cBalcony;
    protected String nBalcony;

    public String getcBalcony() {
        return cBalcony;
    }

    public void setcBalcony(String cBalcony) {
        this.cBalcony = cBalcony;
    }

    public String getnBalcony() {
        return nBalcony;
    }

    public void setnBalcony(String nBalcony) {
        this.nBalcony = nBalcony;
    }
    public Apartment(String cBalcony, String nBalcony){
        this.cBalcony=cBalcony;
        this.nBalcony=nBalcony;
    }
public Apartment(){
    cBalcony="";
    nBalcony="";
}    

    public Apartment(String cBalcony, String nBalcony, String name, String hType, double hPay, String Hloc, int crimeL, int bAmount, String factors, boolean visit, int rating) {
        super(name, hType, hPay, Hloc, crimeL, bAmount, factors, visit, rating);
        this.cBalcony = cBalcony;
        this.nBalcony = nBalcony;
    }


    

}
