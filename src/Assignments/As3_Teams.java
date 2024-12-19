package Assignments;

import java.util.ArrayList;

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
  public ArrayList<As3_Players> allPlayers = new ArrayList<>();

    //constructor
    public As3_Teams(String n, String c, String d, int w, int s, int y, boolean m){

        this.name = n;
        this.city = c;
        this.division = d;
        this.wins = w;
        this.stanleyCups = s;
        this.yearCreated = y;
        this.hasMoved = m;
        this.allPlayers = ArrayList<As3_Players> allPlayers;


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
    public String printAll(){
        if(hasMoved){
            moved = "moved";
        }
        else{
            moved = "never moved";
        }
        return name + " is located in " + city + " in the " + division + " division with " + wins + " wins this season." + " The team was formed in "+ yearCreated + " and has " + moved + "\n List of Players: " + allPlayer.getName()
    }

    public int getWins() {
        return wins;
    }

    public String getDivision() {
        return division;
    }

    public boolean isHasMoved() {
        return hasMoved;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getStanleyCups() {
        return stanleyCups;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getMoved() {
        return moved;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setStanleyCups(int stanleyCups) {
        this.stanleyCups = stanleyCups;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    public void setMoved(String moved) {
        this.moved = moved;
    }

    public ArrayList<As3_Players> getAllPlayers() {
        return allPlayers;
    }
//public String printMe2(int team){
//    return allPlayers.get(team).getNameP() + "'s player ID is " + allPlayers.get(team).getPlayerID() + ", this player has made " +allPlayers.get(team).getGoals()+" goals this year and makes $"+allPlayers.get(team).getSalary() + " million every year";
//}

    public void addPlayers(String nP, int ID, int g, double s){
        allPlayers.add(new As3_Players(nP,ID,g,s));
    }

}
