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
        System.out.println(name + " your lawn was mowed for the price of " + baseFee);
        System.out.println("You owe $" + fees);
    }

    public void processPayments(double dollars){
        fees -= dollars;
        System.out.println(name + "you currently owe $"+ fees);
    }

    public String getName() {
        return name;
    }

    public void delinquent(){
        if(fees > 1200){
            double interest = 10 +fees*0.05;
            fees += interest;
            System.out.println(name + " your payment is overdue. You have been charged interest of $"+interest);
        }
        if(hasDog){
            hasDog = false;
            System.out.println("There is a price to be paid.");

        }

    }

}
