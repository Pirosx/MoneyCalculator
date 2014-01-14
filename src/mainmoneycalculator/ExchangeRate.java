package mainmoneycalculator;

import java.util.Date;

public class ExchangeRate {
    private Number rate;
    private Currency fromCurrency, toCurrency;
    private Date date;

    public ExchangeRate(Number rate, Currency fromCurrency, Currency toCurrency, Date date) {
        this.rate = rate;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.date = date;
    }

    public ExchangeRate(Number rate, Currency fromCurrency, Currency toCurrency) {
        this(rate, fromCurrency, toCurrency, null);
    }

    public Number getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }
}