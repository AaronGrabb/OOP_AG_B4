package Examples;

import java.util.ArrayList;

public class Ex3_Main {

    public static void run(){

        ArrayList<Ex3_Client> allClients = new ArrayList<>();

        allClients.add(new Ex3_Client("Han Solo", "5 Hoth St", 300, false));
        allClients.add(new Ex3_Client("Faraday", "25 France Ave", 1000, true));
        allClients.add(new Ex3_Client("Newton", "189 Wanker St", 5300, false));
        allClients.add(new Ex3_Client("Plank", "89 Nazi Dr", 3400, true));

        System.out.println("Welcome to Moe's Mowing");
        while (true) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1.  Print all Clients");
            System.out.println("2.  Mow all lawns");
            System.out.println("3.  Receive Payment");
            System.out.println("4.  Add new client");
            System.out.println("5.  Delinquent Payments");
            System.out.println("6.  Save and Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();
            if (choice == 1) {

                for (int i = 0; i < allClients.size(); i++) {
                    System.out.println(allClients.get(i));

                }

            } else if (choice == 2) {
                for (int i = 0; i < allClients.size(); i++) {
                    allClients.get(i).mowLawn();

                }
            } else if (choice == 3) {
                System.out.println("Who is paying?");
                String name = Library.input.nextLine();
                System.out.println("How much?");
                double amount = Library.input.nextDouble();
                Library.input.nextLine();

                int foundClient = searchByName(allClients, name);
                allClients.get(foundClient).processPayments(amount);


            } else if (choice == 4) {

            } else if (choice == 5) {

                for (Ex3_Client clientTemp: allClients){
                    clientTemp.delinquent();
                }

            } else {

                break;
            }
        } // while
        System.out.println("There is no use moanin as there is no mow like Moe's mowin.  \nGood bye.");

//        for (int i = 0; i < allClients.size(); i++) {
//            allClients.get(i).mowLawn();
//        }
//
//        for (Ex3_Client clientTemp:  allClients){
//            clientTemp.mowLawn();
//        }
//
//        for (int i = 0; i < allClients.size(); i++) {
//            System.out.println( allClients.get(i));
//        }

    }

    public static int searchByName (ArrayList<Ex3_Client> list, String searchTerm  ){
        for (int i = 0; i < list.size(); i++) {

            if(searchTerm.equalsIgnoreCase(list.get(i).getName())){
                return i;
            }
        }
        return -1;
    }//searchName


}
