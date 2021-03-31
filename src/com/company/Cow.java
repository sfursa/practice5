package com.company;

public class Cow extends Animal {
    int rog;

    public Cow(String nickName, int rog) {
        super(nickName);
        this.rog = rog;
    }
    public void golos(){
        System.out.println("МУУУУ");
    }
}
