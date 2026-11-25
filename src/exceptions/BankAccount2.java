package exceptions;

public class BankAccount2 {
    private double balance;
    public BankAccount2(double balance) {
        this.balance = balance;
    }
    public double withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на балансе");
        }
        balance -= amount;
        return balance;
    }
}

