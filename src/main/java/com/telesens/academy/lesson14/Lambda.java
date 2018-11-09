package com.telesens.academy.lesson14;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {

        String str = "Hello World";
        String str2 = "One,two,three";
        String res = doSomethingWithString(str, s->s.toUpperCase());
        String res2 = doSomethingWithString(str, String::toLowerCase);
        System.out.println(res);
        System.out.println(res2);

        boolean isInRange = checkNumber(10, num -> num <= 20 && num >=10);

        String[] res4 = divideToWords(str2, text -> text.split(","));
        for(String word : res4)
            System.out.println(word);
//        LambdaDemo lambdaDemo = new LambdaDemo();
//        String resNext = lambdaDemo.doSomethingWithStringNoStatic(str);
    }

    private static String doSomethingWithString(String str, Function<String, String> operation) {
        return operation.apply(str);
    }

    private static boolean checkNumber(int number, Predicate<Integer> checker) {
        return checker.test(number);
    }

    private String doSomethingWithStringNoStatic(String str) {
        return null;
    }

    private static String[] divideToWords(String str2, Function<String, String[]> function){
        return function.apply(str2);
    }
}
