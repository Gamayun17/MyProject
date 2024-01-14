package by.me.data.entity;

//для перевода
//
public class Transferrcard {
    private String id;
    private String cardsendone;
    private String cardgetone;
    private String moneyamout;

    private String currencyamount;

    public Transferrcard(){}

    public Transferrcard(String id, String cardsendone, String cardgetone, String moneyamout, String currencyamount) {
        this.id = id;
        this.cardsendone = cardsendone;
        this.cardgetone = cardgetone;
        this.moneyamout = moneyamout;
        this.currencyamount = currencyamount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardsendone() {
        return cardsendone;
    }

    public void setCardsendone(String cardsendone) {
        this.cardsendone = cardsendone;
    }

    public String getCardgetone() {
        return cardgetone;
    }

    public void setCardgetone(String cardgetone) {
        this.cardgetone = cardgetone;
    }

    public String getMoneyamout() {
        return moneyamout;
    }

    public void setMoneyamout(String moneyamout) {
        this.moneyamout = moneyamout;
    }

    public String getCurrencyamount() {
        return currencyamount;
    }

    public void setCurrencyamount(String currencyamount) {
        this.currencyamount = currencyamount;
    }
}
