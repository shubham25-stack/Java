package s1;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        // ArrayList Example
        System.out.println("ArrayList:");
        ArrayList<String> names = new ArrayList<>();
        names.add("Shubham");
        names.add("Shanvi");
        names.add("Ravi");
        names.add("Aaditya"); // duplicate allowed
        System.out.println("ArrayList: " + names);
        System.out.println();

        // LinkedHashMap Example
        System.out.println("LinkedHashMap:");
        LinkedHashMap<Integer, String> studentMap = new LinkedHashMap<>();
        studentMap.put(101, "Shiv");
        studentMap.put(102, "Avni");
        studentMap.put(103, "Ravi");
        System.out.println("LinkedHashMap: " + studentMap);
        System.out.println();
//es
        // SortedSet (TreeSet) Example
        System.out.println("SortedSet (TreeSet):");
        SortedSet<Integer> marks = new TreeSet<>();
        marks.add(85);
        marks.add(92);
        marks.add(75);
        marks.add(85); // duplicate ignored
        System.out.println("SortedSet: " + marks);
        System.out.println();

        // LinkedHashSet Example
        System.out.println("LinkedHashSet:");
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Delhi"); // duplicate ignored
        System.out.println("LinkedHashSet: " + cities);
    }
}
