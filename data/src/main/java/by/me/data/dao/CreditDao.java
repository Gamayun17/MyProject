package by.me.data.dao;

import by.me.data.entity.Credit;
import by.me.data.entity.User;
import com.mysql.cj.xdevapi.Client;

public interface CreditDao {


      String saveNewCredit(Credit credit);
    String updateNewCredit(Credit credit);


    }
