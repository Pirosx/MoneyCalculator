package mainmoneycalculator;

public class Money {
    private Double amount;
    private Currency currency;

    public Money(Double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
}