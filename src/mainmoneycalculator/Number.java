package mainmoneycalculator;

public class Number {
    
    private double num;
    private double denominador;

    public Number(long num, long denominador) {
        this.num = num;
        this.denominador = denominador;
    }

    public double getNum() {
        return num;
    }

    public double getDenominador() {
        return denominador;
    }
    
}