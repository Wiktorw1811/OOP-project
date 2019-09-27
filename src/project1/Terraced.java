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
public class Terraced extends Survey implements Serializable{
    protected String terGarden;
    protected String neighbours;

    public String getTerGarden() {
        return terGarden;
    }

    public void setTerGarden(String terGarden) {
        this.terGarden = terGarden;
    }

    public String getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(String neighbours) {
        this.neighbours = neighbours;
    }
    public Terraced(String tergarden, String neighbours){
        this.terGarden=terGarden;
        this.neighbours=neighbours;
    }
public Terraced(){
    terGarden="";
    neighbours="";  
}

    public Terraced(String terGarden, String neighbours, String name, String hType, double hPay, String Hloc, int crimeL, int bAmount, String factors, boolean visit, int rating) {
        super(name, hType, hPay, Hloc, crimeL, bAmount, factors, visit, rating);
        this.terGarden = terGarden;
        this.neighbours = neighbours;
    }


}
