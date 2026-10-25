import java.math.BigDecimal;

public class Transaction {

    private Long transactionId;
    private String accountNumber;
    private BigDecimal amount;
    private TransactionType transactionType;

    public Transaction(Long transactionId,String accountNumber, BigDecimal amount,TransactionType transactionType) {
       
        
    validateTransactionId(transactionId);
    validateAccountNumber(accountNumber);
    validateAmount(amount);
    validateTransactionType(transactionType);

        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    private void validateTransactionId(Long transactionId) {
        if(transactionId == null || transactionId <= 0) {
            throw new IllegalArgumentException("Transaction ID cannot be Null or Zero");
        }
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount cannot be null or less than or equal to Zero.");
        }
    }

    private void validateAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
    }

    private void validateTransactionType(TransactionType transactionType) {
        if (transactionType == null) {
            throw new IllegalArgumentException("Transaction Type cannot be Null ");
        }
    }




    
}
