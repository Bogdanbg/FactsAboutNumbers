package com.example.factsaboutnumbers;

public class FactModel {

    private String number;
    private String numberFacts;

    public FactModel(String number, String numberFacts) {
        this.number = number;
        this.numberFacts = numberFacts;
    }

    public String getNumber() {
        return number;
    }

    public String getNumberFacts() {
        return numberFacts;
    }
}
