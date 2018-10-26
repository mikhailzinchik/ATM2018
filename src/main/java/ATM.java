public interface ATM {


    void withdraw(long amount, Account account);

    void deposit(long amount, Account account);

    long getBalance(Account account);
}
