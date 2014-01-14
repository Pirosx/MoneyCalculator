package mainmoneycalculator;

import java.util.Date;

public abstract class ExchangeRateLoader {
    
    public abstract ExchangeRate load (Currency fromCurrency, Currency toCurrency);
    public abstract ExchangeRate load (Currency fromCurrency, Currency toCurrency, Date date);
    
}