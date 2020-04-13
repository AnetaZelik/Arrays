package com.company.java.main;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    private String category;
    private String name;
    private Care care;

    public Flower() {
    }

    public Flower(String category, String name, Care care) {
        this.category = category;
        this.name = name;
        this.care = care;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Care getCare() {
        return care;
    }

    public void setCare(Care care) {
        this.care = care;
    }

    //    @Override
    public int compareTo(Flower f) {
        if (((f == null) || (this.getName().compareTo(f.getName()) == 1))) {
            return -1;
        }
        if (this.getName().compareTo(f.getName()) == -1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return category + " "
                + name + " needs "
                + care.toString().toLowerCase() + ". ";
    }

    public List<Flower> getFlowersFromListByCategory(List<Flower> someFlowerList, String category) {
        List<Flower> flowersFromCategory = new ArrayList<>();
        for (Flower flower : someFlowerList) {
            if (flower.getCategory().equals(category)) {
                flowersFromCategory.add(flower);
            }
        }
        for (Flower flower : flowersFromCategory) {
            System.out.println(flower);
        }
        return flowersFromCategory;
    }

    public Flower[] getFlowersFromArrayByCategory(Flower[] someFlowerArray, String category) {
        List<Flower> flowersFromCategoryList = new ArrayList<>();
        for (Flower flower : someFlowerArray) {
            if (flower.getCategory().equals(category)) {
                flowersFromCategoryList.add(flower);
            }
        }
        Flower[] flowersFromCategoryArray= new Flower[flowersFromCategoryList.size()];
        flowersFromCategoryList.toArray(flowersFromCategoryArray);
        for (Flower flower : flowersFromCategoryList) {
            System.out.println(flower);
        }
        return flowersFromCategoryArray;
    }



}