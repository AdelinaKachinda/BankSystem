import java.util.HashMap;

public class BankSystem {
    private HashMap<String, Account> accounts;

    public BankSystem() {
        accounts = new HashMap<>();
    }

    public Account getAccount(String accountNumber) {
        return accounts.computeIfAbsent(accountNumber, Account::new);
    }
}
