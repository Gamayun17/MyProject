package by.me.data.dao;

import by.me.data.entity.Card;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CardDaoImpl implements CardDao {

    @Override
    public String saveNewCard(Card card) {
        return null;
    }

    @Override
    public String createCardwithAccount(Card card) {
        return null;
    }
}
