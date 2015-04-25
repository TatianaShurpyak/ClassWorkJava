package ClassWork;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>();

        fillData(map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

       // map.forEach((k,v) -> System.out.printf("%s%s%n", k, v));
        map.put("another", "data");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        map.remove("Android");

       // map.forEach((k,v) -> System.out.printf("%s%s%n", k, v));

     //   Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }




    }

    private static void fillData(Map<String,String> map) {
        map.put("phone","Android");
        map.put("Eclipse", "Java JDK");
    }

}
