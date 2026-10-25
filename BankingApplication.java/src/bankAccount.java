import java.math.BigDecimal;

public class bankAccount {
    private String accountNumber;
    private String name;
    private BigDecimal balance;

    public bankAccount(String accountNumber, String name, BigDecimal balance) {

        validateAccountNumber(accountNumber);
        validateName( name);
        validateBalance(balance);

        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    private void validateAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account Number cannot be null or empty");
        }
    }

    private void validateName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    private void validateBalance(BigDecimal amount) {
        if(amount == null || amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Balance cannot be null or negative");
        }
    }

    public void deposit(BigDecimal amount) {
        validateDeposit(amount);
        balance = balance.add(amount);
    }

    private void validateDeposit(BigDecimal amount) {
        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        }
    }

    public void withdraw(BigDecimal amount) {
        validateWithdrawal(amount);
        balance = balance.subtract(amount);
    }

   private void validateWithdrawal(BigDecimal amount) {
    if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0 || amount.compareTo(balance) > 0) {
        throw new IllegalArgumentException("Withdrawal amount must be greater than zero and less than or equal to current balance");
    }
}
   }
    

 