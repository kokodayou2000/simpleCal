package org.example.wapper.event;

import org.example.wapper.CalculatorDecorator;
import org.example.wapper.ICalculator;

public class Minus extends CalculatorDecorator {

    public Minus(ICalculator iCalculator) {
        super(iCalculator);
    }

    @Override
    public int cal(int a) {
        super.a -=a;
        return super.a;
    }

    @Override
    public void run(int a) {
        System.out.println("计算器进行了减法运算，结果是"+cal(a));
    }
}
