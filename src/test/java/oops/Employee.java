package oops;

public class Employee {
/*
How many ways we can initialize the values to class variables
1-Using object (directly)
2-Using constructor
3-Using method
 */

    int a=10;
    String b="Welcome";
    double x=343.234;

    void setData(){

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
    }

    void setData2(int SchoolIdNum, String LastName, double ExamResult){

        x=ExamResult;
        a=SchoolIdNum;
        b="Dallas";

    }


/*
    Employee (int id, String name, double num){
        a=id;
        b=name;
        x=num;
    }

 */



    public static void main(String[]args){
/*
        Employee emp=new Employee();
        System.out.println(emp.a);
        System.out.println(emp.b);
        System.out.println(emp.x);

 */

        /*Employee employee=new Employee(978,"Istanbul",654.332);
        employee.setData();
         */

        Employee emp1= new Employee();
        emp1.setData2(141,"Poyraz",95);
        emp1.setData();
    }
}
