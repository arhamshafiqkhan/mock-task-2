package com.arham;

public class UserBankDetails {
    private long id;
    private String bankName;
    private long accountNumber;
    private String creditCardStatus;
    //private boolean creditCardStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCreditCardStatus() {
        return creditCardStatus;
    }

    public void setCreditCardStatus(String creditCardStatus) {
        this.creditCardStatus = creditCardStatus;
    }
}
