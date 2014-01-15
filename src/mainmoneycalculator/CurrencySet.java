package mainmoneycalculator;

import java.util.HashSet;

public class CurrencySet extends HashSet {
    private HashSet<Currency> currencies = new HashSet<>();
    private static CurrencySet instance = null;
    
    private CurrencySet (){
    }
    
    public void addCurrency (Currency currency){
        currencies.add(currency);
    }

    public Currency getCurrency(String code) {
        for (Currency item : currencies) {
            if (item.getCode().equals(code))
                return item;
        }
        return null;
    }
    
    public static CurrencySet getIntance(){
        if (instance == null){
            instance = new CurrencySet();
        }
        return instance;
    }
    
}