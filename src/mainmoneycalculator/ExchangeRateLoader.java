package mainmoneycalculator;

import java.util.Date;

public interface ExchangeRateLoader {
    
    public abstract ExchangeRate load (Currency fromCurrency, Currency toCurrency);
    public abstract ExchangeRate load (Currency fromCurrency, Currency toCurrency, Date date);
    
}