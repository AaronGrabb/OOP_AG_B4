package Assignments;

import java.util.ArrayList;

public class As3_Players {

private String name;
private int playerID;
private int goals;
private double salary;

public As3_Players(String nP, int ID, int g, double s){

    this.name = nP;
    this.playerID = ID;
    this.goals = g;
    this.salary = s;

}

//    public String printMe2(int team){
//        return allPlayers.get(team).getNameP() + "'s player ID is " + allPlayers.get(team).getPlayerID() + ", this player has made " +allPlayers.get(team).getGoals()+" goals this year and makes $"+allPlayers.get(team).getSalary() + " million every year";
//    }

//
    public String printMe2(){

            return name + "'s player ID is " + playerID + ", this player has made " +goals+" goals this year and makes $"+salary+ "million every year.";

    }

public void addGoal(){
  this.goals ++;
}

    public String getNameP() {
        return name;
    }

    public void setNameP(String name) {
        this.name = name;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
