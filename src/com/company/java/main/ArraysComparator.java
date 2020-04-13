package com.company.java.main;

import java.util.Comparator;

public class ArraysComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower f1, Flower f2) {
        if (((f2 == null) || (f1.getName().compareTo(f2.getName()) == -1))) {
        return -1;
    }
        if (f1.getName().compareTo(f2.getName()) == 1) {
        return 1;
    } else {
        return 0;
    }
}
}