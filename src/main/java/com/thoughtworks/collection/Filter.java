package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    //        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
    public List<Integer> filterEven() {

        List<Integer> result = array.stream()
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());

        return result;

    }

    public List<Integer> filterMultipleOfThree() {

        List<Integer> result = array.stream()
                .filter(element -> element % 3 == 0)
                .collect(Collectors.toList());
        return result;

    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = firstList.stream()
                .filter(element -> secondList.contains(element))
                .collect(Collectors.toList());
        return result;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = array.stream().distinct().collect(Collectors.toList());
        return result;
    }
}