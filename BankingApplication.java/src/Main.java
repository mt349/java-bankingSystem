import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        bankAccount account = new bankAccount("408","Klaus Blackwood", new BigDecimal("1000.00"));
        account.deposit(new BigDecimal(500.00));
        account.withdraw(new BigDecimal(300.00));
        System.out.println("AccountNumber : " + account.getAccountNumber());
        System.out.println("Name : " + account.getName());
        System.out.println("Balance : " + account.getBalance());

        Transaction transaction1 = new Transaction(24487L, "2834", new BigDecimal("7000.00"), TransactionType.WITHDRAWAL);

        System.out.println("Transaction ID :" + transaction1.getTransactionId());
        System.out.println("Account Number :" + transaction1.getAccountNumber());
        System.out.println("Amount :" + transaction1.getAmount());
        System.out.println("Transaction Type :" + transaction1.getTransactionType());

        

    }
}