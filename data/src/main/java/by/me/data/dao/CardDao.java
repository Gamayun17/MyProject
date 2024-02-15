package by.me.data.dao;

import by.me.data.pojo.Card;
import by.me.data.pojo.CardDetails;

import java.sql.SQLException;

public  interface CardDao  {

    Card getCardById(int id);//or read
    int addCard(Card card);// void save
    void updateCard(Card card) throws SQLException, ClassNotFoundException;


}
