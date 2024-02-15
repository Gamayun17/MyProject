package by.me.data.dao;

import by.me.data.dto.DepositDto;
import by.me.data.pojo.CardDetails;

public interface CardDetailsDao {
    CardDetails getCardDetailsById(int id);
    int addCardDetails(CardDetails cardDetails);// void save
    void updateCardDetails(CardDetails cardDetails);//
}
