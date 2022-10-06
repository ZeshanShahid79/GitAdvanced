package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        System.out.println("Zeshan!");
        System.out.println("creating branches and push on different head´s");
        System.out.println("Hello World");
        System.out.println("Zeshan234");
        System.out.println("die nächste");

        Name zeshan = new Name("Zeshan");


         List<Name> zeshansArray = new ArrayList<>();
        zeshansArray.add(zeshan);

        Map<Integer,Name> listOfNames = new HashMap<>();
        listOfNames.put(1,zeshan);

        System.out.println("Zeshan Shahid");
    }
}