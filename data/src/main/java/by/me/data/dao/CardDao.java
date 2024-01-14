package by.me.data.dao;

import by.me.data.entity.Card;

public  interface CardDao  {

    String saveNewCard(Card card);

    String createCardwithAccount(Card card);


}
