package InterFaces;

interface  TestEx{
    int a=10;//it should be static veriable
    void display();//it should be abstract method because we difened as an interface
}
public class InterfaceExample implements TestExx {
    public void display(){
        System.out.println(a);
    }

    public static void main (String []a){

        InterfaceExample2 intx=new InterfaceExample2();
        intx.display();
    }

}
