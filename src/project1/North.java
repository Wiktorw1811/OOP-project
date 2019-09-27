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
public class North extends Project1 implements Serializable{
    private String type4;
    private String cost4;
    private String location4;
    
    
    public North(){
    
        type4="";
        cost4="";
        location4="";
    }
    public North(String type4,String cost4,String location4,String name, String type, String cost, String location){
    
         super(type,cost,location);
       this.type4=type4;
       this.cost4=cost4;
       this.location4=location4;
    }
    
    //Setters

    public void setType4(String name4) {
        this.type4 = name4;
    }

    public void setCost4(String time4) {
        this.cost4 = time4;
    }

    public void setLocation4(String day4) {
        this.location4 = day4;
    }
    
    //Getters

    public String getType4() {
        return type4;
    }

    public String getCost4() {
        return cost4;
    }

    public String getLocation4() {
        return location4;
    }
    
    @Override
    public String printDetails(){
    
        return " \n \n"+super.printDetails()+"\n : "+type4+"\n : "+cost4+"\n : "+location4;
    }
    
}