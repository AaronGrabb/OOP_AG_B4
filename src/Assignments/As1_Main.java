package Assignments;

import Examples.Ex2_Actor;

import java.util.ArrayList;

public class As1_Main {
    public static void run(){

        ArrayList<As1_Crop> allCrops = new ArrayList<>();

        allCrops.add(new As1_Crop("Grapes", 10, "tonnes", 10.96*1000));
        allCrops.add(new As1_Crop("Apples", 10, "tonnes", 5.5*1000));
        allCrops.add(new As1_Crop("Plums", 5, "tonnes", 7.97*1000));
        allCrops.add(new As1_Crop("Corn", 5, "tonnes", 3.40*1000));

        for (int i = 0; i < allCrops.size(); i++) {
            System.out.println(allCrops.get(i));
            System.out.println("");
        }

    }
}
