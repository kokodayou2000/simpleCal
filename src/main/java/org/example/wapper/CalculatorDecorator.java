package org.example.wapper;


public abstract class CalculatorDecorator implements ICalculator {
    public static int a = 0;

    protected ICalculator iCalculator;

    public CalculatorDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

}
