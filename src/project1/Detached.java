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


public class Detached extends Survey implements Serializable{
    protected String extension;
    protected String advantage;

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public Detached(String extension, String advantage) {
        this.extension = extension;
        this.advantage = advantage;
    }
public Detached(){
    extension="";
    advantage="";
    
}

    public Detached(String extension, String advantage, String name, String hType, double hPay, String Hloc, int crimeL, int bAmount, String factors, boolean visit, int rating) {
        super(name, hType, hPay, Hloc, crimeL, bAmount, factors, visit, rating);
        this.extension = extension;
        this.advantage = advantage;
    }

    
}

