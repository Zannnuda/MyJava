package com.company;

import java.util.Scanner;

public class Read {

    public double readNext() {
        Scanner sc = new Scanner(System.in);
        double i;
        String s;
        if (sc.hasNextDouble()) {
            i = sc.nextDouble();
        }
        else
        {
            s = sc.nextLine();
        i = fromRoman(s);
        }
        return  i;
    }
    public int fromRoman(String s) {

        int result = 0;
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


        for (int i = 0; i < decimal.length; i++) {
            while (s.indexOf(roman[i]) == 0) {
                result += decimal[i];
                s = s.substring(roman[i].length());
            }
        }
        System.out.println(result);
        return result;
    }
}
