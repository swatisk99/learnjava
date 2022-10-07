package com.learn.java.day9.extra;

class Check {
    private static class A { 
        int a=44;
        void setA(int a){
            this.a=a;
        }
    }

    public static class B extends A {
        //A aobj = new A();
        void showAContents(){
            System.out.print(a);
            System.out.print(this);
        }
    }
    void createA(){
        A aobj = new A();
        System.out.print(aobj);
    }
}

public class Main {
    public static void main(String[] args) {
        Check.B b = new Check.B();
        b.showAContents();
        b.setA(12);
        b.showAContents();
        new Check().createA();
    }
}
