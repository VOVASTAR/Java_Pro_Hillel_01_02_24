package edu.hillel.lectures.string;

public class TestIntegerClass {
    public static void main(String[] args) {
        int a = 10;
        int b = a--;
        int c = --b;
        b *= 5;
        System.out.println("a=" + (++a) + ", b=" + b + ", c=" + c);
    }
}
