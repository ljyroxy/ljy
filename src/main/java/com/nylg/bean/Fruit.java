package com.nylg.bean;



import java.text.SimpleDateFormat;
import java.util.Date;

public class Fruit {
    private String fruit;
    private int kilo;
    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruit='" + fruit + '\'' +
                '}';
    }

    public double price(){
        double price = 0;
        if(this.fruit.equals("苹果")){
            price=8*this.kilo;
        }
        if(this.fruit.equals("草莓")){
            SimpleDateFormat sf=new SimpleDateFormat("HHmm");
            String date=sf.format(new Date());
            int time=Integer.parseInt(date);
            if(time>100&&time<300){
                price=13*this.kilo*0.8;
            }else {
                price = 13 * this.kilo;
            }
        }
        if(this.fruit.equals("芒果")){
            price=20*this.kilo;
        }
        return price;
    }
}
