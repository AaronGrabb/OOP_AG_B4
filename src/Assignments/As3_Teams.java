package Assignments;

public class As3_Teams {
//instance variables
    private String name;
    private String city;
    private String division;
    private int wins;
    private int stanleyCups;
    private int yearCreated;
    private boolean hasMoved;
    private String moved;


    //constructor
    public As3_Teams(String n, String c, String d, int w, int s, int y, boolean m){

        this.name = n;
        this.city = c;
        this.division = d;
        this.wins = w;
        this.stanleyCups = s;
        this.yearCreated = y;
        this.hasMoved = m;

    }


    public String printMe(){
       if(hasMoved){
           moved = "moved";
       }
       else{
           moved = "never moved";
       }
        return name + " is located in " + city + " in the " + division + " division with " + wins + " wins this season." + " The team was formed in "+ yearCreated + " and has " + moved;
    }

    public int getWins() {
        return wins;
    }

    public String getDivision() {
        return division;
    }
}
