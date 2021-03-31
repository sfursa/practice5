package com.company;

public class Animal {
    String nickName;
    public static int count;
    public Animal(String nickName) {
        this.nickName = nickName;
        count++;
    }
    public void golos (){
        System.out.println();
    }
    public static void zsa (){
        System.out.println(count);
    }
}

