package exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств! Баланс: " + balance);
        }
        balance -= amount;
        System.out.println("Снято: " + amount + ". Остаток: " + balance);
    }
}
