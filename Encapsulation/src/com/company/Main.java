package com.company;

public class Main {
    private int age = 21;
    private int Display(){
        return this.age;
    }
    public static void main(String[] args) {
	// write your code here
        Main myMain = new Main();
        System.out.println(myMain.Display());
    }
}
