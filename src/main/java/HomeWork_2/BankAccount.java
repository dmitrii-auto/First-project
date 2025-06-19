package HomeWork_2;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String someOwner, int someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner() {
        return this.owner;
    }

    int getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    int deposit(int amount) {
        if (amount > 0) {
            return balance += amount;
        } else {
            throw new IllegalArgumentException("Сумма пополнения должна быть больше нуля");
        }
    }

    int withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            return balance -= amount;
        } else if (amount > balance) {
            throw new IllegalArgumentException("На балансе недостаточно средств, ваш текущий баланс " + balance);
        } else {
            throw new IllegalArgumentException("Сумма вывода должна быть больше нуля");
        }
    }

    void printBalance() {
        System.out.println("Ваш текущий баланс = " + balance + " рублей");
    }


}
