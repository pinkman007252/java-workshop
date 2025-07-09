package com.vetias.java.workshop.basics.tem.bin;

public class calculator {
    public int add(int a, int b) {
        return a + b;
    }       
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
     calculator calc = new calculator();
     System.out.println("Addition: " + calc.add(5, 3));
     System.out.println("Subtraction: " + calc.subtract(5, 3));
     System.out.println("Multiplication: " + calc.multiply(5, 3));

    }
    
}
