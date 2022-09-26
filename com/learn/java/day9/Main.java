package com.learn.java.day9;

class Super {
    static {int taxi = 1729;
        //System.out.print(taxi);
    }
}
class Sub extends Super {
    
    static{
       // System.out.print(taxi); 
        
        System.out.print("Sub "); 
    }
    static int taxi=20;
}
class Main {
    public static void main(String[] args) {
    	Sub n = new Sub();
    	int x = Sub.taxi;
        System.out.println(x);
    }
}