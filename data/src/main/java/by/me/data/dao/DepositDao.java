package by.me.data.dao;

import by.me.data.entity.Deposit;
import by.me.data.entity.User;

public interface DepositDao {
    void saveNewDeposit(Deposit deposit, User user);
}
