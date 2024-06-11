// Classe CheckingAccount
class CheckingAccount {
    private double balance;
    private String name;

    // Construtor
    public CheckingAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    // Getters e Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
