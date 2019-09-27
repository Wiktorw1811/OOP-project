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
public class Central extends Project1 implements Serializable{
    private String location1;
    private String location2;
    private String cost1;
    private String cost2;
    
      public Central(String location1, String location2, String cost1, String cost2,String type, String location, String cost) {
        super(type,location,cost);
        this.location1 = location1;
        this.location2 = location2;
        this.cost1 = cost1;
        this.cost2 = cost2;
    }
    
    public Central(){
    
        location1="";
        location2="";
        cost1="";
        cost2="";
    
    }
    //setters

    public void setLocation1(String location1) {
        this.location1 = location1;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public void setCost1(String cost1) {
        this.cost1 = cost1;
    }

    public void setCost2(String cost2) {
        this.cost2 = cost2;
    }
    
    //Getters

    public String getLoctaion1() {
        return location1;
    }

    public String getLoctaion2() {
        return location2;
    }

    public String getCost1() {
        return cost1;
    }

    public String getCost2() {
        return cost2;
    }
    

    @Override
   public String printDetails(){
    
        return "House \n \n"+super.printDetails()+"\n No. of Bathrooms: "+location1+"\n No. of Bedrooms: "+cost1+"\n No. of Bathrooms: "+location2+"\n No. of other rooms: "+cost2;
    }
    

   
    
    
}
