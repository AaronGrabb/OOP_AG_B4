package Assignments;

import Examples.Ex2_Actor;
import Examples.Ex3_Client;
import Examples.Library;

import java.util.ArrayList;

public class As1_Main {
    public static void run(){

        ArrayList<As1_Crop> allCrops = new ArrayList<>();

        allCrops.add(new As1_Crop("Grapes", 10, "tonnes", 10.96*1000));
        allCrops.add(new As1_Crop("Apples", 10, "tonnes", 5.5*1000));
        allCrops.add(new As1_Crop("Plums", 5, "tonnes", 7.97*1000));
        allCrops.add(new As1_Crop("Corn", 5, "tonnes", 3.40*1000));

        allCrops.get(0).setAcres(250);
        allCrops.get(1).setAcres(100);
        allCrops.get(2).setAcres(300);
        allCrops.get(3).setAcres(350);
        while (true) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1.  Print all Plants");
            System.out.println("2.  Search and harvest");
            System.out.println("3.  Total Revenue");
            System.out.println("4.  Plant a crop");
            System.out.println("5.  Exit");


            int choice = Examples.Library.input.nextInt();
            Library.input.nextLine();
            if (choice == 1) {

                for (int i = 0; i < allCrops.size(); i++) {
                    System.out.println(allCrops.get(i).printMe());

                }

            } else if (choice == 2) {
                System.out.println("Which crop would you like to harvest?");
                String harvestPlant = Library.input.nextLine();


                for (int i = 0; i < allCrops.size(); i++) {
                    System.out.println(allCrops.get(i).getName());
                    System.out.println(harvestPlant);

                    if(allCrops.get(i).getName().equalsIgnoreCase(harvestPlant)){

                        System.out.println(allCrops.get(i).printMe());
                        System.out.println("Do you want to harvest this crop?");
                        String harvesting = Library.input.nextLine();
                        if(harvesting.toLowerCase().contains("y")){
                            System.out.println("Harvesting: "+harvestPlant);
                           double earnings = allCrops.get(i).harvest();
                            System.out.println("You gained $"+earnings);


                        }

                    }
                    else{
                        System.out.println("Not FOund");
                    }

                }
            } else if (choice == 3) {
                System.out.println("Who is paying?");
                String name = Examples.Library.input.nextLine();
                System.out.println("How much?");
                double amount = Examples.Library.input.nextDouble();
                Library.input.nextLine();

//                int foundClient = searchByName(allCrops, name);
//                allCrops.get(foundClient).processPayments(amount);


            } else if (choice == 4) {


            } else {

                break;
            }
        } // while

        for (int i = 0; i < allCrops.size(); i++) {

            System.out.println(allCrops.get(i));
            System.out.println("");
        }

    }
    public static int searchByName (ArrayList<As1_Crop> list, String searchTerm  ){
        for (int i = 0; i < list.size(); i++) {

            if(searchTerm.equalsIgnoreCase(list.get(i).getName())){
                return i;
            }
        }
        return -1;
    }//searchName
}
