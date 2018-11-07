package com.telesens.academy.lesson08;

public enum Season {
    winter("Зима"),
    spring("Весна"),
    summer,
    autumn("Осень");

    private String ruName;

    Season(){}

    Season(String ruName){
        this.ruName = ruName;
    }
    @Override
    public String toString(){
        return ruName;
    }

    public Season next(){
        int indexCurrent = ordinal();
        Season[] arraySeasons = values();
        return arraySeasons[indexCurrent+1];
    }
}
