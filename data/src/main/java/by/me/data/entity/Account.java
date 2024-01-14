package by.me.data.entity;

import java.util.List;

public class Account {
    private String id;
    private String number;
    private String currency;
    private List<Card> cards;

    private User user;

    public Account(){}

    public Account(String id, String number, String currency, List<Card> cards, User user) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.cards = cards;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
