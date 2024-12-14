package com.epam.mjc.collections.set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squareSet = sourceList.stream()
                .map(n -> n * n)
                .filter(n -> n >= lowerBound && n <= upperBound)
                .collect(Collectors.toCollection(TreeSet::new));
        return squareSet;
    }
}
