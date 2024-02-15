package by.me.data.dto;

import java.io.Serializable;

public class AccountClientDto implements Serializable {
    private String id;
    private String number;
    private String currency;

    private BankClientDto user;

    public AccountClientDto(String id, String number, String currency, BankClientDto user) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.user = user;
    }


}
