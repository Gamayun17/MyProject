package by.me.data.dto;

public class CardDto {

    private final String id;
    private final String name;
    private final String number;

    private final String CVC;
    private  final String cash;

    public CardDto(String id, String name, String number, String cvc, String cash) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.CVC = cvc;
        this.cash = cash;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCash() {
        return cash;
    }
}
