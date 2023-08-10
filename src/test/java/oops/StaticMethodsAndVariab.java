package oops;

public class StaticMethodsAndVariab {

    int a;
    static int b;

    static void m1(){
        System.out.println("this is m1- static method");
    }

    void m2(){
        System.out.println("this is m2- non-static method");
    }

    void m3(){
        a=500;
        b=1000;

        m1();
        m2();
    }

    public static void main(String[]a){
        b=100;
        System.out.println(b);
        m1();

        //a=200; not accessible bcozy it is non static
        //m2(); not accessible bcozy it is non static

        StaticMethodsAndVariab smv= new StaticMethodsAndVariab();
        smv.a=300;
        System.out.println(smv.a);
        smv.m2();

    }
}
