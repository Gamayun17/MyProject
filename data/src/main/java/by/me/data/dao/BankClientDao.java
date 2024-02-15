package by.me.data.dao;


import by.me.data.dto.BankClientDto;
import by.me.data.pojo.BankClient;

public interface BankClientDao {
    BankClientDto getBankClientById(int id);//or read
    int addBankClient(BankClientDto bankClientDto);// void save
    void updateBankClient(BankClientDto bankClientDto);
    boolean deleteBankClient(int id);// or remove

}

