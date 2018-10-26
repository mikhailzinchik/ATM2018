
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ATMSession session1 = new ATMSession();
        ATMSession session2 = new ATMSession();
        ATMSession session3 = new ATMSession();

        session1.start();
        session2.start();
        session3.start();

        Thread.sleep(2000);
        System.out.println(Account.account.getBalance());
   }
}
