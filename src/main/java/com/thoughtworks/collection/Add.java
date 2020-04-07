package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int result = 0;

        List<Integer> intList= genIntListBetweenTwoInt(leftBorder, rightBorder);

        result = intList.stream().mapToInt(
                element -> (element % 2 == 0 ? element : 0))
                .sum();
        return result;
    }

    public List<Integer> genIntListBetweenTwoInt(int leftBorder, int rightBorder){
        if(leftBorder > rightBorder){
            int sortLeftBorderAndRightBorder = 0;
            sortLeftBorderAndRightBorder = rightBorder;
            rightBorder = leftBorder;
            leftBorder = sortLeftBorderAndRightBorder;
        }

        List<Integer> intList = IntStream.rangeClosed(leftBorder, rightBorder).boxed()
                .collect(Collectors.toList());
        return intList;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int result = 0;

        List<Integer> intList= genIntListBetweenTwoInt(leftBorder, rightBorder);

        result = intList.stream().mapToInt(
                element -> (element % 2 != 0 ? element : 0))
                .sum();
        return result;
    }


}
