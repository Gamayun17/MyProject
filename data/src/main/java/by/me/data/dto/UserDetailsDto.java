package by.me.data.dto;

import by.me.data.entity.UserAddress;

import java.io.Serializable;
import java.util.Date;

public class UserDetailsDto implements Serializable {

    private final String id;
    private final String name;
    private final String surename;

    private final Date birthDate;

    private final String phoneNo;

    private final String passport;
    private final String identificationNumber;

    private final UserAddressDto userAddressDto;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPassport() {
        return passport;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public UserAddressDto getUserAddressDto() {
        return userAddressDto;
    }

    public UserDetailsDto(String id, String name, String surename, Date birthDate, String phoneNo, String passport, String identificationNumber, UserAddressDto userAddressDto) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.birthDate = birthDate;
        this.phoneNo = phoneNo;
        this.passport = passport;
        this.identificationNumber = identificationNumber;
        this.userAddressDto = userAddressDto;


    }
}
