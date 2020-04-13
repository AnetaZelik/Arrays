package com.company.java.main.test;

import com.company.java.main.Care;
import com.company.java.main.Flower;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    @Test
    void getFlowersFromListByCategoryTest() {
        //given
        List<Flower> testList = new ArrayList<>() {{
            add(new Flower("succulents", "cactus", Care.WATERING));
            add(new Flower("creepers", "aloe", Care.WATERING));
            add(new Flower("creepers", "aloe", Care.WATERING));
        }};
        List<Flower> expectedList = new ArrayList<>() {{
            add(new Flower("creepers", "aloe", Care.WATERING));
            add(new Flower("creepers", "aloe", Care.WATERING));
        }};

        //when
        List<Flower> actualList = testList.get(0)
                .getFlowersFromListByCategory(testList, "creepers");

        //then
        assertEquals(expectedList.toString(), actualList.toString(), "Given lists are not equal.");

    }

    @Test
    void getFlowersFromArrayByCategoryTest() {
        //given
        Flower[] testArray = new Flower[]{
                new Flower("succulents", "cactus", Care.WATERING),
                new Flower("succulents", "aloe", Care.WATERING),
                new Flower("creepers", "aloe", Care.WATERING)
        };

        Flower[] expectedArray = new Flower[]{
                new Flower("succulents", "cactus", Care.WATERING),
                new Flower("succulents", "aloe", Care.WATERING),
        };

        //when
        Flower[] actualArray = testArray[0].getFlowersFromArrayByCategory(testArray, "succulents");

        //then
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(actualArray), "Given arrays are not equal.");

    }
}