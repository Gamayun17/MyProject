package by.me.data.dto;



import jakarta.persistence.Column;

import java.io.Serializable;

public class BankClientDto implements Serializable {
    private int bankClientId;
    private String password;
    private int roleId;//
    private int personId;//

}
