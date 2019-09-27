/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.Serializable;

/**
 *
 * @author x17361401
 */
public class South extends Project1 implements Serializable{
    
    private String type3;
    private String location3;
    private String cost3;
    
    public South(){
    
        type3="";
        location3="";
        cost3="";
    }

    public South(String type3, String location3, String cost3,String type, String location, String cost) {
         super(type,location,cost);
        this.type3 = type3;
        this.location3 = location3;
        this.cost3 = cost3;
    }
    
    //Setteres

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public void setLocation3(String location3) {
        this.location3 = location3;
    }

    public void setCost3(String cost3) {
        this.cost3 = cost3;
    }
    
    //Getters

    public String getType3() {
        return type3;
    }

    public String getLocation3() {
        return location3;
    }

    public String getCost3() {
        return cost3;
    }
    
    public String printDetails(){
    
        return "1 Storey House \n \n"+super.printDetails()+"\n No. of Bathrooms: "+type3+"\n No. of Bedrooms: "+location3+"\n No. of other Rooms: "+cost3;
    }
    
}
