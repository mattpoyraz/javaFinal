package arraysTwoDimen;

public class ArrayTwo {

    public static void main (String []args){


        Object x[][]=new Object[3][2];

        x[0][0]="Welcome";
        x[0][1]=6465;

        x[1][0]='c';
        x[1][1]=6543.3321;

        x[2][0]=true;
        x[2][1]=false;

        int y[][]={{12,43},{32,65},{23,67}};




        for (int a=0; a<=2; a++){
            for(int b=0; b<=1; b++){
                System.out.print(x[a][b]);
            }
            System.out.println();
        }

        for(Object []h:x){
            for(Object c:h){
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
