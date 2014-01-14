package mainmoneycalculator;

import java.util.Date;

public class MockExchangeRateLoader extends ExchangeRateLoader {
    private ExchangeRate exchangeRate;

    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExchangeRate load(Currency fromCurrency, Currency toCurrency, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}