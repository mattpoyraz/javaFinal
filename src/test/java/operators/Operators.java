
package operators;

public class Operators {
    public Operators() {
    }

    public static void main(String[] args) {
        int a = 5;
        double b = 4.1;
        boolean log = true;
        boolean log2 = false;
        System.out.println((double)a / b);
        System.out.println(b * (double)a);
        System.out.println((double)a + b);
        System.out.println((double)a - b);
        System.out.println((double)a % b);
        System.out.println((double)a < b);
        System.out.println((double)a > b);
        System.out.println((double)a <= b);
        System.out.println((double)a >= b);
        System.out.println((double)a == b);
        System.out.println((double)a != b);
        System.out.println(log2 && log);
        System.out.println(log || log2);
        System.out.println(!log);
        System.out.println(!log2);
        int x = 100;
        x += 200;
        x *= 10;
        x /= 3;
        x -= 400;
        System.out.println(x);
        ++x;
        --x;
        x -= 100;
        x += 350;
        x *= 12;
        System.out.println(x);
    }
}
