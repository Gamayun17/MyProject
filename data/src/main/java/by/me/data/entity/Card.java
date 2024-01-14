package by.me.data.entity;

import java.util.Objects;

public class Card {

    private String id;
    private String name;
    private String number;
    private String cash;
    private String CVC;

    public Card(){}


    public Card(String id, String name, String number, String cash) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.cash = cash;
        this.CVC = CVC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }


}
