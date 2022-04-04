//Write a program to demonstrate static variables, methods, and blocks.
package Bridgelabz;

public class StaticVariables {
    //Static variables
    static int a = 3;
    static int b;
    //Static Method
    static void method(int x) {
        System.out.println("x = " +x);
        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }
    //Static block
    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }
    public static void main(String[] args) {
        method(42);
    }
}
