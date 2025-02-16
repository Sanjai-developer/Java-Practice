import java.util.*;
import java.util.*;
public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Cherry");
        list1.add("Date");
        list1.add("Gzper"); 
        list1.add("Banana");        
        list1.add("Elderberry");
        list1.add("Fig");

        System.out.println("list1: " + list1);
        System.out.println("list1 Size : " + list1.size());
        System.out.println("list1 Contains 'Banana' : " + list1.contains("Banana"));
        System.out.println("list 1 : "+ list1.get(2));
        list1.set(1,"Grape");
        System.out.println("list1 after set : " + list1);
        list1.remove("Cherry");
        System.out.println("list1 after remove : " + list1);
        list1.sort(Comparator.naturalOrder());
        System.out.println("list1 after sort : " + list1);
        list1.sort(Comparator.reverseOrder());
        System.out.println("list1 after reverse sort : " + list1);
        list1.forEach(System.out::println);
        list1.forEach(item -> System.out.println(item));
        list1.forEach(item -> {
            System.out.println(item);
        });
        
        


        
        
    }
}