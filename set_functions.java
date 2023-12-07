import java.util.HashSet;
import java.util.Set;

public class set_functions {
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to the first set
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // Add elements to the second set
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Perform union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Perform intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Perform difference (set1 - set2)
        Set<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference1);

        // Perform difference (set2 - set1)
        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference (set2 - set1): " + difference2);
    }
}

