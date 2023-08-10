package ArrayListAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[]arg){

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"ismet");
        hm.put(200,"erkan");
        hm.put(300,"gaziantep");

        System.out.println(hm);

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }

}
