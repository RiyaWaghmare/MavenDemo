package com.sapient.training.ui;

import com.sapient.training.service.Calculator;

public class App {
    public static void main( String[] args )    {
    	Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.addition(2.0, 3.0) );
        System.out.println(myCalculator.substraction(2, 3) );
    }
}
