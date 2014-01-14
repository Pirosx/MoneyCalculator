package mainmoneycalculator;

import java.util.HashSet;

public class CurrencySet extends HashSet {
    private HashSet<Currency> currencies;
    private boolean instance = false;
    
    public CurrencySet (){
        currencies = new HashSet<>();
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
    
  /*  public boolean getIntance(){
        if (!instance){
            instance = true;
            return false;
        }
        return instance;
    }*/
    
}