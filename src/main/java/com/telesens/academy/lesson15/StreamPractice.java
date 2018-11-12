package com.telesens.academy.lesson15;

import com.telesens.academy.lesson10.CompareDresses;
import model.EntityDress;

import java.util.Arrays;
import java.util.Comparator;

public class StreamPractice {
    public static void main(String[] args) {

        EntityDress[] dresses = CompareDresses.getExpectedDresses();

        Arrays.stream(dresses)
                .filter(s->s.getColor().equals("orange"))
                .reduce(StreamPractice::maxByPrice)
                .ifPresent(System.out::println);

        Arrays.stream(dresses)
                .sorted(Comparator.reverseOrder())
                .mapToDouble(p->p.getPrice())
                .forEach(System.out::println);
    }

    private static EntityDress maxByPrice (EntityDress e1, EntityDress e2){
        if (e1.getPrice() > e2.getPrice())
            return e1;
        else
            return e2;
    }
}
