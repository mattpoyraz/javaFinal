
package accessmodifiers;

public class PrivateAndDefault {
    public PrivateAndDefault() {
    }

    public static void main(String[] a) {
        A acm = new A();
        acm.b = 200;
        B acmb = new B();
        acmb.x = 500;
        acmb.m2();
    }
}
