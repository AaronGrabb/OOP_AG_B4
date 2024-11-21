package Assignments;

public class As1_Crop {
    //instance variables
    private String name;
    private double yield;
    private String units;
    private double price;
    private int acres;
     //cosntructor
    public As1_Crop(String n, double y, String u, double p){
        name = n;
        yield = y;
        units = u;
        price = p;
        acres = 0;
    }
public String toString(){
        return name + "  " + yield + "  " + units + "  " + price;
}

public static void setAcres(){
        return acres;

}
    

}
