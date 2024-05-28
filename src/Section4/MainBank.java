package Section4;

public class MainBank {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(1);
        bankAccount.setAccountBalance(100);
        bankAccount.setCustomerEmail("bala@gmail.com");
        bankAccount.setCustomerName("bala");
        bankAccount.setCustomerPhone(987654321);

        System.out.println(bankAccount.getCustomerName() + " has a total balance of " + bankAccount.getAccountBalance());

        bankAccount.depositFunds(500);
        bankAccount.withdrawFunds(699);
    }

}
