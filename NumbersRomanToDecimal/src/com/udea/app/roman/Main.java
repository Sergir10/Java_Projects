package com.udea.app.roman;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String romanToDecimal(String romanNumber) {
        int decimalValue = 0;
        romanNumber = romanNumber.toUpperCase();

        for (int i = 0; i < romanNumber.length(); i++) {
            char specificCharInRoman = romanNumber.charAt(i); // Obteniendo las letras caracter a caracter.
            switch (specificCharInRoman) {
                case 'I':
                    decimalValue++;
                    break;
                case 'V':
                    decimalValue += 5;
                    break;
                case 'X':
                    decimalValue += 10;
                    break;
                case 'L':
                    decimalValue += 50;
                    break;
                case 'C':
                    decimalValue += 100;
                    break;
                case 'D':
                    decimalValue += 500;
                    break;
                case 'M':
                    decimalValue += 1000;
                    break;
                default:
                    break;
            }
        }

        if (romanNumber.contains("IV") || romanNumber.contains("IX")) {
            decimalValue -= 2;
        }
        if (romanNumber.contains("XL") || romanNumber.contains("XC")){
            decimalValue -= 20;
        }
        if (romanNumber.contains("CD") || romanNumber.contains("CM")) {
            decimalValue -= 200;
        }

        return String.valueOf(decimalValue);
    }
}
