package com.telesens.academy.lesson14;

import com.telesens.academy.lesson10.CompareDresses;
import model.EntityDress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class LambdaDemo {
    public static void main(String[] args) {
        EntityDress[] dresses = CompareDresses.getExpectedDresses();
        List<EntityDress> listDresses = new ArrayList<>(Arrays.asList(dresses));
        System.out.println(listDresses);
        // 1 способ
        listDresses.sort(new DressComparator());
        System.out.println(listDresses);
        // 2 способ
        Comparator<EntityDress> sortByPriceDesc = new Comparator<EntityDress>() {
            @Override
            public int compare(EntityDress dress1, EntityDress dress2) {
                return Double.compare(dress2.getPrice(), dress1.getPrice());
            }
        };
        listDresses.sort(sortByPriceDesc);
        System.out.println(listDresses);
        // 3 способ (лямбда выражение)
        Comparator<EntityDress> sortByModel = (dress1, dress2) -> dress1.getModel().compareTo(dress2.getModel());
        listDresses.sort(sortByModel);
        System.out.println(listDresses);
        // 4 способ (лямбда выражение)
        listDresses.sort((d1, d2) -> d1.getName().compareTo(d2.getName()));
        System.out.println(listDresses);
        // 5 способ (лямбда выражение)
        listDresses.sort(Comparator.comparing(EntityDress::getColor));
        System.out.println(listDresses);
    }
}
