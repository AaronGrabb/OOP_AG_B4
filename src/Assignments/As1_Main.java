package Assignments;

import Examples.Ex2_Actor;
import Examples.Ex3_Client;
import Examples.Library;

import java.util.ArrayList;

public class As1_Main {
    public static void run(){

        double totalRevenue = 0;

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




                    int foundIndex = searchByName(allCrops, harvestPlant);
                    if(foundIndex > -1) {
                        System.out.println(allCrops.get(foundIndex).printMe());
                        System.out.println("Do you want to harvest this crop?");
                        String harvesting = Library.input.nextLine();
                        if (harvesting.toLowerCase().contains("y")) {
                            System.out.println("Harvesting: " + harvestPlant);
                            double earnings = allCrops.get(foundIndex).harvest();
                            totalRevenue += earnings;
                            System.out.println("You gained $" + earnings);
                        }
                    }

                    else{
                        System.out.println("Not FOund");
                    }


            } else if (choice == 3) {
                System.out.println("Total Revenue gained :$" + totalRevenue);

            } else if (choice == 4) {
                System.out.println("Which crop would like to plant?");
                String newCrop = Library.input.nextLine();
                if(searchByName(allCrops, newCrop) > -1){
                    System.out.println("How many acres of it do you want to plant?");
                    int newAcres = Library.input.nextInt();
                    Library.input.nextLine();
                    allCrops.get(searchByName(allCrops, newCrop)).setAcres(allCrops.get(searchByName(allCrops, newCrop)).addAcres(allCrops,newAcres,searchByName(allCrops, newCrop)));
                }
                else{
                    System.out.println("This is a new plant! how many acres of it do you want to plant?");
                    int newAcres = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("What unit is it measured in?");
                    String newUnit = Library.input.nextLine();
                    System.out.println("How many " + newUnit + " per acre is produced?");
                    double newYield = Library.input.nextDouble();
                    Library.input.nextLine();
                    System.out.println("What's the price per "+ newUnit + "?");
                    double newPrice = Library.input.nextDouble();
                    Library.input.nextLine();
                    allCrops.add(new As1_Crop(newCrop,newYield, newUnit,newPrice));
                    allCrops.get(allCrops.size() -1).setAcres(newAcres);
                }

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
