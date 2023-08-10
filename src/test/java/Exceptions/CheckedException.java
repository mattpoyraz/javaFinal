
package Exceptions;

public class CheckedException {
    public CheckedException() {
    }

    public static void main(String[] ar) {
        System.out.println("program is started");
        System.out.println("program is in progress");

        try {
            Thread.sleep(4000L);
        } catch (InterruptedException var2) {
            System.out.println(var2.getMessage());
        }

        System.out.println("program is completed");
        System.out.println("program is exited");
    }
}
