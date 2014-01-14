package mainmoneycalculator;

public class MockCurrencySetLoader implements CurrencySetLoader {
    
    @Override
    public CurrencySet load(){
        CurrencySet currencySet = new CurrencySet();
        currencySet.add(new Currency("EUR", "Euro", "€"));
        currencySet.add(new Currency("USD", "Dollar americano", "$"));
        currencySet.add(new Currency("GBP", "Libra Esterlina", "£"));
        currencySet.add(new Currency("JPY", "Yen Japones","¥"));
        return currencySet;
    }
}