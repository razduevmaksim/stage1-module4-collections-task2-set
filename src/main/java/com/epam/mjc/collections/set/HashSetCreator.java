package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultList = new HashSet<>();

        for (int value : sourceList) {
            resultList.add(value);

            if (value % 2 == 0) {
                while (value % 2 == 0) {
                    value /= 2;
                    resultList.add(value);
                }
            } else {
                value *= 2;
                resultList.add(value);
            }
        }

        return resultList;
    }
}
