package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (array) -> {
            ArrayList<Integer> dividedArray = new ArrayList<>();

            array.forEach(el -> dividedArray.add(el / divider));

            return dividedArray;
        };
    }
}
