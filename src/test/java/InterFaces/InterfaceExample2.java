
package InterFaces;

public class InterfaceExample2 implements TestExx {
    public InterfaceExample2() {
    }

    public void display() {
        System.out.println(10);
    }

    public static void main(String[] a) {
        InterfaceExample2 intx = new InterfaceExample2();
        intx.display();
    }
}
