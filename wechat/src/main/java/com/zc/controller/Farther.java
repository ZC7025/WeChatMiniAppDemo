package com.gs.controller;

/**
 * Created by 123456 on 2018/3/23.
 */
public class Farther {

    int m = 50;

    public Farther(){
        System.out.println("Farther no-args");
    }

    public Farther(int m){
        this.m = m;
        System.out.println("Farther arg" + m);
    }

    public void sum(int n){
        System.out.println("Farther sum" + m * n);
    }

}
class Child extends Farther{
    int m = 0;

    public Child(){
        System.out.println("Child no-args");
    }

    public Child(int m){
        this();
        this.m = m;
        System.out.println("Child arg" + m);
    }

    public void sum(int n){
        System.out.println("Child sum" + m * n);
    }

    public static void main(String[] args) {
        Child child = new Child(2);
        child.sum(1);
    }
    /**
     *
     * Farther no-args
     * Child no-args
     * Child arg2
     * Child sum2
     */
}
