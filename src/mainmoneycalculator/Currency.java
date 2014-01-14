package mainmoneycalculator;

public class Currency {
    private String name, symbol, code;

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }
    public Currency(String name, String code) {
        this(name,code,null);
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCode() {
        return code;
    }
    
}