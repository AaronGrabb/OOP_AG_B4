package Assignments;

import java.util.ArrayList;

public class As1_Crop {
    //instance variables
    private String name;
    private double yield;
    private String units;
    private double price;
    private int acres;
     //cosntructor
    public As1_Crop(String n, double y, String u, double p) {
        name = n;
        yield = y;
        units = u;
        price = p;
        acres = 0;
    }
    //Instance methods
public String toString(){
        return name + "  " + yield + "  " + units + " per acre $" + price + " per ton  Num of Acres:" + acres;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public int addAcres(ArrayList<As1_Crop> list, int a, int i){
        int newAcres;
        newAcres = a + list.get(i).acres;
        return newAcres;
    }


    public String getName() {
        return name;
    }

    public String printMe(){
        return name + "  " + yield + "  " + units + " per acre $" + price + " per ton  Num of Acres:" + acres;
    }
    public double harvest(){
        double money;
        money = price*yield*acres;
        if(money == 0){
            System.out.println("You must plant this before harvesting!");
        }
setAcres(0);
return money;

    }
}
