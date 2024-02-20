package com.interview.preparation.August;

public interface InterfaceTest {
    public int a= 53; // interface can have public static and final variable

    static int ab=433;
    abstract  void getDetails(); // interface can have abstract method

    default void getName() { // interface can have default method with body

    }
    static void getSolution(){ //interface can have static method

    }
    //no constructor
    //no private protected field or method allowed
    //no non-static and non-final value are allowed.
    //no final method are allowed


}
abstract class AbstractClassTest{
public int a=23;
private int b=434;
protected  int c=34;
public  AbstractClassTest(){
    System.out.println
            ("abstract class can have constructor");
}
abstract void abstractmethod();
private static void staticMethod(){
    System.out.println("abstrct class can have private and static method");
}
public void nonStaticMethod(){
    System.out.println("can have public and nonstatic method");
}
protected  void protectedMethod(){
    System.out.println("can have protected method");
}
final void finalMethod(){
    System.out.println("can have final method");
}
//no default method in an abstract class
}
