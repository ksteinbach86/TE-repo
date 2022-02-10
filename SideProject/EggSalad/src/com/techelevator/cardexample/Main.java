package com.techelevator.cardexample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        File data = new File("data");
        if (!data.isDirectory()) {
            System.out.println("Not a data directory. Abort! Abort!");
            System.exit(1);
        }

        String[] files = data.list();
        int found = -1;
        List<Aisle> aisles = new ArrayList<>();
        Aisle aisle;
        for (String file : files) {
            if (file.endsWith(".Items.aisle")) {
                String aisleName = file.substring(0, file.length() - 12);
                aisle = null;
                for (int i = 0; i < aisles.size(); i++) {
                    if (aisles.get(i).getAisleName().equals(aisleName)) {
                        found = i;
                    }
                }
                if (found == -1) {
                    aisle = new Aisle(aisleName);
                }



            }
        }
    }
}
