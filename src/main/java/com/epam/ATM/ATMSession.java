package com.epam.ATM;

public class ATMSession extends Thread {
    @Override
    public void run() {
        ATM atm = new SimpleATM();
        atm.deposit(3000, Account.account);
        atm.withdraw(200, Account.account);
    }
}
