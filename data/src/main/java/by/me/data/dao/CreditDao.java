package by.me.data.dao;

import by.me.data.dto.CreditDto;
import by.me.data.dto.DepositDto;
import by.me.data.pojo.Credit;

public interface CreditDao {


    CreditDto getCreditById(int id);
    int addCredit(CreditDto creditDto);// void save


    }
