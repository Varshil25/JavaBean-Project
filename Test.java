package com.test;

import com.bean.UserBean;

public class Test {
    public static void main(String[] args) {
        UserBean user = new  UserBean();
        user.setUserId("VP1234");
        user.setUsername("Varshil Patel");
        user.setAccountNo("9104433064");
        user.setPassword("Vpatel@25");
        user.setbalance(12000);

        String User_Id = user.getUserId();
        System.out.println(User_Id);

        System.out.println(user);

    }
}
