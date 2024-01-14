package by.me.service;


import by.me.model.CardServ;
import by.me.model.UserService;

public interface CardService {

    void saveNewCard(CardServ cardServ, UserService userService, String clientId);

     String getCardNumb ();

}
