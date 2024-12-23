package Assignments;

import Examples.Ex3_Client;
import Examples.Library;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class As3_LeagueMain {


    //    allTeams.add(new As3_Teams());
    public static void run() {
//        ArrayList<As3_Players> allPlayers = new ArrayList<>();
        ArrayList<As3_Teams> allTeams = new ArrayList<>();
        loadFile("data/nhlTeams.csv", allTeams);

        for (int i = 0; i < allTeams.size(); i++) {
            for (int j = 0; j < 5; j++) {
                allTeams.get(i).addPlayers(allTeams.get(i).getName() + "Player" + j, 1034+j*8, 67+j,1.3+j/2);
            }
        }


        while (true) {

            System.out.println("Press 1 for printing teams\nPress 2 to find average amount of wins this season\nPress 3 to view divisions\nPress 4 to sort by age\nPress 5 to update stats\nPress 6 to add a new player\nPress 7 to print players of a team\nPress 8 to save and exit.");


            int choice = Examples.Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                System.out.println("Print teams");
                for (int i = 0; i < allTeams.size(); i++) {
                    System.out.println(allTeams.get(i).printMe());


                }
            }
                if (choice == 2) {
                    System.out.println("Find average of 2024 season wins");
                    int total = 0;
                    double average = 0.0;
                        for (int i = 0; i < allTeams.size(); i++){
                        total += allTeams.get(i).getWins();
                        }

                        average = total/(allTeams.size());
                    System.out.println("Average wins this season:" + average);
                }
                if (choice == 4) {
                    System.out.println("Sort by date of formation");
//                    sortByAge();
                    for (int i = 0; i < allTeams.size(); i++) {

                            int lowestIndex = i;
                            for(int j=i+1; j<allTeams.size(); j++){
                                if(allTeams.get(j).getYearCreated() < allTeams.get(lowestIndex).getYearCreated()){
                                    lowestIndex = j;
                                }
                            }
                            //swap the data
                            int temp = allTeams.get(i).getYearCreated();
                            allTeams.get(i).setYearCreated(allTeams.get(lowestIndex).getYearCreated()) ;
                            allTeams.get(lowestIndex).setYearCreated(temp);



                    }
                }
                if (choice == 5) {
                    boolean found = false;
                    int location = 0;
                    System.out.println("Update stats, which team needs a update in amount of wins?");
                    String answer = Library.input.nextLine();
                    for (int i = 0; i < allTeams.size(); i++) {
                        if(allTeams.get(i).getName().equalsIgnoreCase(answer)){
                            found = true;
                            location = i;
                        }
                    }
                    if(found){
                        System.out.println("How many wins does this team have now?");
                        int newWins = Library.input.nextInt();
                        allTeams.get(location).setWins(newWins);

                    }
                    else{
                        System.out.println("Team is not found");
                    }
                }
                if (choice == 3) {
                    System.out.println("View Divisions");
                String answer = Library.input.nextLine();
                    for (int i = 0; i < allTeams.size(); i++) {
                        if(allTeams.get(i).getDivision().equalsIgnoreCase(answer)){
                            System.out.println(allTeams.get(i).printMe());
                        }
                    }

                }

                if(choice == 6){
                    System.out.println("Which team is getting a new player?");
                    String answer = Library.input.nextLine();
                    for (int i = 0; i < allTeams.size(); i++) {
                        if(allTeams.get(i).getName().equalsIgnoreCase(answer)){
                            allTeams.get(i).addPlayers("George", 1776, 76, 13.5);
                        }

                    }

                }
                if(choice == 7){
                    System.out.println("Which team's players do you want to see?");
                    System.out.println(allTeams.get(0).getAllPlayers().printMe2());
                    String answer = Library.input.nextLine();
                    for (int i = 0; i < allTeams.size(); i++) {
                        if(allTeams.get(i).getName().equalsIgnoreCase(answer)){
                            System.out.println(allTeams.get(i).getAllPlayers());
                        }

                    }
                }
                if (choice == 8) {
                    saveFile("nhlTeams.csv", allTeams);
                    break;
                }
                System.out.println();

            }//while

            System.out.println("Good bye");






        }




    public static void loadFile(String filename, ArrayList<As3_Teams> list) {

        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));

            String dataToRead;
            while (file.ready()) {
                dataToRead = file.readLine();

                String tempArray[] = dataToRead.split(",");
//the next line is customized for whatever class you are creating.
//Here we create a new STUDENT so there are 5 variables
//Unfortunately, you need to Parse any variable that is not a String.  Integers, doubles and booleans are all demonstrated below.
                list.add(new As3_Teams(tempArray[0], tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), Integer.parseInt(tempArray[4]), Integer.parseInt(tempArray[5]), Boolean.parseBoolean(tempArray[6])));

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile


    public static void saveFile(String filename, ArrayList<As3_Teams> tempList ) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
//the next lines are customized for whatever data you are getting.
                String toSave ="";
                toSave = tempList.get(i).getName();  //assumes getter method are used for private variables
                toSave +="," + tempList.get(i).getCity();
                toSave += "," + tempList.get(i).getDivision();
                toSave +="," + tempList.get(i).getWins();
                toSave +="," + tempList.get(i).getYearCreated();
                toSave +="," + tempList.get(i).isHasMoved();

//The above 6 lines could be replaced by a call to a carefully made toString() function

                file.println(toSave);

            }
            file.close();
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }//end saveFile




}