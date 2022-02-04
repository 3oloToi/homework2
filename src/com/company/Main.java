package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemperature(28,18));
        System.out.println(ageTemperature(29,18));
        System.out.println(ageTemperature(18,28));
        System.out.println(ageTemperature(14,30));
        System.out.println(ageTemperature(19,29));
        System.out.println(generateRandomAge()+" "+ageTemperature(generateRandomAge(),20));

    }
    public static String ageTemperature (int age,int temperature){
        if (age>20 && age<45 && temperature>-20 && temperature<30){
            return "можно идти гулять";

        }
        if (age<20 && temperature >0 && temperature<28){
            return "можно идти гулять";

        }
        if (age>45 && temperature >-10 && temperature <25){
            return "можно идти гулять";

        }
        else {
            return "оставайтесь дома";
        }


    }
    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(0, 50);
        return age;
    }
}
