package Examples;

import java.util.ArrayList;

public class Ex3_Main {

    public static void run(){

        ArrayList<Ex3_Client> allClients = new ArrayList<>();

        allClients.add(new Ex3_Client("Han Solo", "5 Hoth St", 300, false));
        allClients.add(new Ex3_Client("Faraday", "25 France Ave", 1000, true));
        allClients.add(new Ex3_Client("Newton", "189 Wanker St", 5300, false));
        allClients.add(new Ex3_Client("Plank", "89 Nazi Dr", 3400, true));

        for (int i = 0; i < allClients.size(); i++) {
            System.out.println( allClients.get(i));
        }

    }


}
