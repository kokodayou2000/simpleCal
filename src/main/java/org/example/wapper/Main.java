package org.example.wapper;

import org.example.wapper.event.Add;
import org.example.wapper.event.Div;
import org.example.wapper.event.Minus;
import org.example.wapper.event.Mul;
import org.example.wapper.impl.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ICalculator calculator = new Calculator();



        calculator = new Add(calculator);
        calculator.run(10);
        calculator.run(10);
        calculator = new Add(calculator);
        calculator.run(11);

        calculator = new Minus(calculator);
        calculator.run(1);

        calculator = new Mul(calculator);
        calculator.run(2);



//        while (true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("输入操作符");
//            String option = scanner.next();
//            System.out.println(option);
//            System.out.println("输入数字");
//            int number = scanner.nextInt();
//            System.out.println(number);
//            switch (option){
//                case "add": calculator =  new Add(calculator); break;
//                case "minus": calculator =  new Minus(calculator);break;
//                case "mul": calculator =  new Mul(calculator);break;
//                case "div": calculator =  new Div(calculator);break;
//                default:{
//                    System.out.println("输入的操作错误");
//                    continue;
//                }
//            }
//            calculator.run(number);
//        }


    }
}

