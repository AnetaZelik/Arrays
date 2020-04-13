package com.company.java.main;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] filledTab = new String[3];
        Arrays.fill(filledTab, "the same String");
        System.out.println("Printing filled tab:");
        for (String stringValue : filledTab) {
            System.out.println(stringValue);
        }
        System.out.println(" ");

        Flower[] flowersArray = new Flower[]{
                new Flower("succulent", "cactus", Care.WATERING),
                new Flower("creeper", "ivy", Care.CUTTING),
                new Flower("blooming", "rose", Care.CUTTING),
                new Flower("succulent", "aloe", Care.CUTTING),
                new Flower("creeper", "grapevine", Care.CUTTING),
                new Flower("blooming", "aster", Care.CUTTING),
        };

        System.out.println("Printing flowers array:");
        for (Flower flower : flowersArray) {
            System.out.println(flower);
        }
        System.out.println(" ");

        System.out.println("Printing sorted with comparator flowers array:");
        ArraysComparator comparator = new ArraysComparator();
//        Arrays.sort(flowersArray, comparator);
        for (Flower flower : flowersArray) {
            System.out.println(flower);
        }
        System.out.println(" ");

        List<Flower> flowersList = Arrays.asList(flowersArray);
//        flowersList.sort(comparator);
        System.out.println("Printing flowers list:");
        for (Flower flower : flowersList) {
            System.out.println(flower);
        }
        System.out.println(" ");

        System.out.println("Printing methods: *ByCategory");
        Flower myFlower1 = flowersArray[0];
        Flower myFlower2 = flowersList.get(0);
        myFlower1.getFlowersFromArrayByCategory(flowersArray, "succulent" );
        myFlower2.getFlowersFromListByCategory(flowersList, "succulent");

    }
}
