package com.example.calculator;

import org.springframework.stereotype.Service;

import static org.apache.coyote.http11.Constants.a;

@Service
public class CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return String.format("%s + %s = %s",num1,num2,sum);
    }
    public String minus (int num1, int num2) {
        int sum = num1 - num2;
        return String.format("%s - %s = %s",num1,num2,sum);
    }
    public String multiply(int num1, int num2) {
        int sum = num1 * num2;
        return String.format("%s * %s = %s",num1,num2,sum);
    }
    public String divide(int num1, int num2) {
        int sum = num1 / num2;
        if (num2 != 0) {
            return String.format("%s / %s = %s", num1, num2, sum);
        } else {
            return "На ноль делить нельзя!";
        }
    }
}
