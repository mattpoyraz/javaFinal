package oops;

public class Calculation {

     int x;
     int y;

    //1- method may not take parameters-empty parameters
/*
    void sum(){
        System.out.println(x+y);
    }

    //2- method takes parameters and neww

    void sum(int a, int b){
        x=a;
        y=b;
        System.out.println(x+y);
    }

 */
    int sum2(){
        return (x+y);
    }



    public static void main(String []args){
        Calculation calculation=new Calculation();
        //1- result of first one
        /*
        calculation.x=100;
        calculation.y=200;
        calculation.sum();
         */
        //2- result of second one
        /*
        calculation.sum(100,200);
         */
        //3- X+Y method returns some values
        calculation.x=500;
        calculation.y=600;
        int cont=calculation.sum2();
        System.out.println(cont);





    }



}
