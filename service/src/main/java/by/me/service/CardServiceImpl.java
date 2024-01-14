package by.me.service;


import by.me.model.CardServ;
import by.me.model.UserService;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Override
    public void saveNewCard(CardServ cardServ, UserService userService, String clientId) {

    }

    @Override
    public String getCardNumb() {
        return null;
    }
}