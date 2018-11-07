package com.telesens.academy.tests.lesson07;

import com.telesens.academy.lesson07.Button;

public class ButtonTest {
    public static void main(String[] args) {
        Button button = new Button();
        button.print();
        testConstructor();
    }

    private static void testConstructor(){
        Button button = new Button(10, 20, "Login");
        int width = button.getWidth();
        int height = button.getHeigh();
        String text = button.getText();

        System.out.println(width == 10);
        assert width == 10;
    }
}
