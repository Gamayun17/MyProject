package by.me.service;


import by.me.dto.DepositDto;

public interface DepositService {

    void saveNewDeposit(DepositDto depositDto, String userId);

}
