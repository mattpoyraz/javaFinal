package conditions;

public class Conditions {
    public static void main(String []args){

        //if condition
        int ali=15;

        if(ali>10){
            System.out.println("ali is greater than 15");
        }

        //if else condition
        if(ali==10){
            System.out.println("ali is not equal to :10");
        }
        else {
            System.out.println("ali is equal to :15");
        }
        //Nested if else condition
        if(ali==20){
            System.out.println("i run as a if");
        }
        else if(ali!=15){
            System.out.println("i run as a else if");
        }
        else {
            System.out.println("i run as a else");
        }

        int day=10;
        switch (day){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            default: System.out.println("nothing above");
        }


    }
}
