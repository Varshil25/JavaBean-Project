package com.bean;

import java.io.Serializable;

public class UserBean implements Serializable {
    // member variables ---> bean properties.
    private String UserId;
    private String Username;
    private String AccountNo;
    private String Password;
    private double balance;

    public void setUserId(String UserId){
        this.UserId = UserId;
    }

    public void setUsername(String Username){
        this.Username = Username;
    }

    public void setAccountNo(String AccountNo){
        this.AccountNo = AccountNo;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public String getUserId(){
        return UserId;
    }

    public String getUsername(){
        return Username;
    }

    public String getAccountNo(){
        return AccountNo;
    }

    public String getPassword(){
        return Password;
    }

    public double getbalance(){
        return balance;
    }



    @Override
    public String toString() {
        return "UserBean [userId = " + UserId + " UserName = " + Username + " AccountNo = " + AccountNo + " Password = " + Password + " Current Balance = " + balance + "  ]";

    }
}
