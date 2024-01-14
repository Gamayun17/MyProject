package by.me.data.entity;

import java.util.Date;

public class UserDetails {

    private String id;
    private String name;
    private String surename;

    private Date birthDate;

    private String phoneNo;

    private String passport;
    private String identificationNumber;

    private UserAddress userAddress;

    public UserDetails(String id, String name, String surename, Date birthDate, String phoneNo, String passport, String identificationNumber, UserAddress userAddress) {
        this.id = id;
        this.name = name;
        this.surename = surename;
        this.birthDate = birthDate;
        this.phoneNo = phoneNo;
        this.passport = passport;
        this.identificationNumber = identificationNumber;
        this.userAddress = userAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
}
