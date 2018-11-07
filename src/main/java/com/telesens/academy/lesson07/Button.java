package com.telesens.academy.lesson07;

public class Button {
    private int width;
    private int heigh;
    private String text;
    private int[] backgroundColor;
    private int[] texColor;
    private boolean enabled;

    public Button() {
    }

    public Button(int width, int heigh, String text) {
        this.width = width;
        this.heigh = heigh;
        this.text = text;
    }

    public Button(int width, int heigh, String text, int[] backgroundColor, int[] texColor, boolean enabled) {
        this.width = width;
        this.heigh = heigh;
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.texColor = texColor;
        this.enabled = enabled;
    }

    public Button(int width, int heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int[] getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int[] backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int[] getTexColor() {
        return texColor;
    }

    public void setTexColor(int[] texColor) {
        this.texColor = texColor;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void print(){
        System.out.println(String.format("Width: %d", width));
    }
}
