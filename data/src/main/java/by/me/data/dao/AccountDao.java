package by.me.data.dao;

import by.me.data.entity.Account;

public interface AccountDao {
   String saveNewAccount(Account account);
   String updateAccount(Account account);


}
