package ArrayListAndHashMap;

import java.util.ArrayList;

public class ArrayListEx {
    /*
    Array limitations
    -----------------
    1-Fixed in size
    2-Can hold same data type elements---> object
     */
    /*
    int a[]=new int[5]; Normal array declaration
    ArrayList al=new ArrayList();
    ArrayList<Integer> al=new ArrayList<Integer>();
     */
    public static void main(String[]args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("ismet");
        al.add("poyraz");
        al.add("gaziantep");
        System.out.println(al.size());

        for(String x:al){
            System.out.println(x);
        }

        ArrayList arx=new ArrayList();
        arx.add("Welcome");
        arx.add(10);
        arx.add(10.50);
        arx.add("c");

        System.out.println("number of elements in array list are :"+arx.size());
        arx.add(3,"Mehmet");
        arx.remove(4);
        arx.add(2,"Dallas");
        System.out.println("number of elements in array list are :"+arx.size());


    }

}
