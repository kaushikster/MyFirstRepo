package com.Kaushik;

public class Hamburger {
    private String rollType;
    private String meat;
    private int price;
    private String name;
    private int additionalLimit;

    public Hamburger(String rollType, String meat, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = 4;
        this.name = name;
    }
    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    //test git


    public void getAdditionalItems(String item){
        switch (item){
            case "Lettuce":

        }

    }
}
