package by.me.data.dto;

import by.me.data.entity.Card;
import by.me.data.entity.User;

import java.io.Serializable;
import java.util.List;

public class AccountDto  implements Serializable {
    private String id;
    private String number;
    private String currency;

    private UserDto user;

    public AccountDto(String id, String number, String currency, UserDto user) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.user = user;
    }


}
