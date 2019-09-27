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
public class SemiDetached extends Survey implements Serializable{
    protected String garden;
    protected String Pattached;

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public String getPattached() {
        return Pattached;
    }

    public void setPattached(String Pattached) {
        this.Pattached = Pattached;
    }
    
    public SemiDetached(String garden, String Pattached){
        this.garden=garden;
        this.Pattached=Pattached;
    }
public SemiDetached(){
        garden="";
        Pattached="";
    }

    public SemiDetached(String garden, String Pattached, String name, String hType, double hPay, String Hloc, int crimeL, int bAmount, String factors, boolean visit, int rating) {
        super(name, hType, hPay, Hloc, crimeL, bAmount, factors, visit, rating);
        this.garden = garden;
        this.Pattached = Pattached;
    }


    
    
    
}
