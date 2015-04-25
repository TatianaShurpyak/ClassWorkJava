package ClassWork;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List <String> listA = new ArrayList<String>();
        listA.add("element 1");
        listA.add("element 2");
        listA.add("element 3");

        String element0 = listA.get(0);
        String element1 = listA.get(1);
        String element2 = listA.get(2);

        Iterator iterator = listA.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);

        }
        for (Object object : listA) {
            String element = (String) object;
            System.out.println(element);
        }


    }
}
