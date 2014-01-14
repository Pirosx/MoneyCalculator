package mainmoneycalculator;

public class MainMoneyCalculator {

    public static void main(String[] args) {
        CurrencySetLoader loader = new MockCurrencySetLoader();
        CurrencySet currencySet = loader.load();
        
    }
}