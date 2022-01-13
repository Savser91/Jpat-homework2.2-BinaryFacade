package com.company;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("01101010", "10001110"));
        System.out.println( bins.mult("111001", "10101"));
    }
}
