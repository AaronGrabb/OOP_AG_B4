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
        ArrayList<As3_Teams> allTeams = new ArrayList<>();
        loadFile("data/nhlTeams.csv", allTeams);

        while (true) {

            System.out.println("Press 1 for printing teams\nPress 2 to find team with most wins\nPress 3 to view divisions\nPress 4 to sort by age\nPress 5 to update stats\nPress 6 to save and exit.");


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
                }
                if (choice == 5) {
                    System.out.println("Update stats");
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

                if (choice == 6) {
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