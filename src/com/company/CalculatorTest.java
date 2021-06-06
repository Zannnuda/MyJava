package com.company;

public class CalculatorTest {
    public static void main(String[] args) {
        Read read = new Read();
        double one;
        double two;
        System.out.println("Введите первое число :");
        one = read.readNext();
        System.out.println("Введите второе число :");
        two = read.readNext();

        Calculator calculator = new Calculator(one, two);

        System.out.println("Выберите действие :");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("0. Выход");

        int action = (int) read.readNext();

        switch (action) {
            case 1 : System.out.println(calculator.add());break;
            case 2 : System.out.println(calculator.subs());break;
            case 3 : System.out.println(calculator.mult());break;
            case 4 : System.out.println(calculator.div());break;
            case 0 : break;
            default:
                System.out.println("Вы выбрали неверный пункт");

        }

    }
}
