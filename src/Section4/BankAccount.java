package Section4;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double amount) {
        this.accountBalance += amount;
        System.out.println("Deposit of $" + amount + " made. New Balance is $" + this.getAccountBalance());
    }

    public void withdrawFunds(double amount) {
        double remainingBalance = this.accountBalance - amount;

        if (remainingBalance < 0) {
            System.out.println("Cannot withdraw this amount");
            System.out.println("Remaining balance is " + this.getAccountBalance());
        } else {
            this.accountBalance = remainingBalance;
            System.out.println("Remaining balance is " + this.getAccountBalance());
        }

    }
}
