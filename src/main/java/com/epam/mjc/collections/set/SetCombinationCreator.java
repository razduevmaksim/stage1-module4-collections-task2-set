package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();

        Set<String> firstAndSecond = new HashSet<>(firstSet);
        firstAndSecond.retainAll(secondSet);
        firstAndSecond.removeAll(thirdSet);
        resultSet.addAll(firstAndSecond);

        Set<String> third = new HashSet<>(thirdSet);
        third.removeAll(firstSet);
        third.removeAll(secondSet);
        resultSet.addAll(third);

        return resultSet;
    }
}
