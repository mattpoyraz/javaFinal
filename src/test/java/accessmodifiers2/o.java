
package accessmodifiers2;

import accessmodifiers.protected1;

class Protected2 extends protected1 {
    Protected2() {
    }

    public static void main(String[] args) {
        Protected2 prc = new Protected2();
        prc.h = 700;
        prc.setData9();
    }
}
