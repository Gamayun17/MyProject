package by.me.data.dao;

import by.me.data.dto.AccountClientDto;
import by.me.data.dto.BankClientDto;
import by.me.data.pojo.AccountClient;

public interface AccountClientDao {
    AccountClientDto getAccountClientById(int id);//or read
    int addAccountClient(AccountClientDto accountClientDto);// void save
    void updateAccountClient(AccountClientDto accountClientDto);
    boolean deleteAccountClient(int id);// or remove


}
