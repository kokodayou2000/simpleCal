package org.example.wapper.impl;

import org.example.wapper.ICalculator;

/**
 * 对象类
 */
public class Calculator implements ICalculator {

    @Override
    public int cal(int a) {
        return 0;
    }

    @Override
    public void run(int a) {
        System.out.println("计算器还没有进行计算");
    }
}
