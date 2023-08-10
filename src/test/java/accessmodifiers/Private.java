
package accessmodifiers;

class A {
    private int a = 10;
    int b;

    A() {
    }

    private void m1() {
        System.out.println(this.a);
    }
}
