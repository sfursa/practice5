package com.company;

public class Dog extends Animal {

    public Dog(String nickName) {
        super(nickName);
    }

    @Override
    public void golos() {
        super.golos();
        System.out.println("Гав-гав");
    }
}
