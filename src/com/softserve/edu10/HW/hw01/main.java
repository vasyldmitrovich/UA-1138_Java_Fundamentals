
import java.util.HashSet;
import java.util.Set;

import static com.softserve.edu10.HW.hw01.Set.intersect;
import static com.softserve.edu10.HW.hw01.Set.union;

public static void main(String[] args) {

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    set1.add(1);
    set1.add(2);
    set1.add(3);

    set2.add(2);
    set2.add(3);
    set2.add(4);


    Set<Integer> unionResult = union(set1, set2);
    System.out.println("Union " + unionResult);


    Set<Integer> intersectResult = intersect(set1, set2);
    System.out.println("Intersection " + intersectResult);
}


