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
public class Project1 implements Serializable {
    protected String type;
    protected String cost;  
    protected String location;
    
    public Project1() {
        type = "";
        cost = "";
        location = "";
        
    }
     public Project1(String type, String cost, String loaction) {
        this.type = type;
        this.cost = cost;
        this.location = location;
    }
    public String getType() {
        return type;
    }

    public String getCost() {
        return cost;
    }

    public String getLocation() {
        return location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
     public String printDetails(){
       return "House Name: "+type+"\n Location: "+type+"\n House Type: "+location+"\n Price: "+cost;
    }
}
        

