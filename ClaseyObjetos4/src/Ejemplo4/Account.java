package Ejemplo4;

public class Account {
    // atributos
    private String id;
    private String name;
    private int balance;

    // constructor
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // métodos
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Monto excedido del saldo");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (balance >= amount) {
            balance -= amount;
            another.credit(amount); 
        } else {
            System.out.println("Monto excedido del saldo");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + this.balance + "]";
    }
}