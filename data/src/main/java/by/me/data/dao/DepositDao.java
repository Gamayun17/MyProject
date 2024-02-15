package by.me.data.dao;

import by.me.data.dto.DepositDto;
import by.me.data.dto.RoleDto;
import by.me.data.pojo.Deposit;
import by.me.data.pojo.BankClient;

public interface DepositDao {
    DepositDto getDepositById(int id);
    int addDeposit(DepositDto depositDto);//save

}
