package HomeWork_life;

public class BankAccount {

    String owner;
    int balance;

    BankAccount (String newOwner, int newBalance){
        this.owner = newOwner;
        this.balance = newBalance;
    }

    String getOwner(){
        return this.owner;
    }

    int getBalance(){
        return this.balance;
    }

    int deposit(int amount){
        if (amount > 0 ){
            return balance += amount;
        } else {
            throw new IllegalArgumentException("Сумма для пополнения должна быть больше нуля");
        }
    }

    int withdraw(int amount){
        if (amount > 0 && amount <= balance){
            return balance -= amount;
        } else if (amount > balance){
            throw new IllegalArgumentException("На балансе недостаточно средств. Ваш текущий баланс" + balance);
        } else {
            throw new IllegalArgumentException("Сумма вывода должна быть больше нуля");
        }
    }

    void printBalance(){
        System.out.println("Ваш текущий баланс " + balance + " рублей" );
    }

}
