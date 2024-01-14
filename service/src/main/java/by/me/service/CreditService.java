package by.me.service;


import by.me.dto.CreditDto;

public interface CreditService {


    void saveNewCredit(CreditDto creditDto, String userId);

}
