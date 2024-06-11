public class AccountTest {
    public static void main(String[] args) {
        // Instanciando um objeto CheckingAccount
        CheckingAccount account = new CheckingAccount(1000.0, "John Doe");

        // Atribuindo valores aos campos balance e name
        double balance = account.getBalance();
        String name = account.getName();

        System.out.println("Nome: " + name);
        System.out.println("Saldo: $" + balance);
    }
}