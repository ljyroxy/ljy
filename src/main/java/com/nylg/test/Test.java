package com.nylg.test;

import com.nylg.bean.Fruit;

import java.text.ParseException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        boolean b = true;
        double totalPrice=0;
        String s=null;
        int kilo=0;
        System.out.println("要买什么水果,买多少");
        while (b) {
            Fruit f=new Fruit();
            s=sc.next();
            if(s.equals("#")){
                break;
            }
            kilo=sc.nextInt();
            f.setFruit(s);
            f.setKilo(kilo);
            totalPrice+=f.price();
        }
        if(totalPrice>=100){
            totalPrice-=10;
        }
        System.out.println(totalPrice);
    }
}
