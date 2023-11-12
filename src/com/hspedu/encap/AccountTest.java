package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Patrick");
        account.setBalance(59);
        account.setPwd("123423");
        account.showInfo();
    }
}
