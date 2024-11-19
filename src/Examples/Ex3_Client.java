package Examples;

public class Ex3_Client {

    //instance variables
    private String name;
    private String address;
    private int lawnSize;
    private boolean hasDog;
    private double fees;

    //Constructor methods
    public Ex3_Client(String n, String a, int l, boolean d){
        name = n;
        address = a;
        lawnSize = l;
        hasDog = d;
        fees = 0;
    }

    //instance methods
    public String toString(){
        return name +"  " + address + "  " + lawnSize + "  " + hasDog + "  " + fees;
    }

    public void mowLawn(){
double baseFee = 30;
if(lawnSize >= 1000){
    baseFee += 0.1 * lawnSize;
}
else{
    baseFee += 0.2 * lawnSize;
}
if(hasDog){
    baseFee += 40;
}

fees += baseFee;
        System.out.println(name + "Your lawn was mowed for the price of " + baseFee);
        System.out.println("You owe $" + fees);
    }

}
