import java.util.*;

public class Intersection2Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n :
                nums1) {
            set1.add(n);
        }
        for (int n :
                nums2) {
            set2.add(n);
        }
        return getIntersection(set1,set2);

    }
    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> integerSet = new HashSet<>();
        if (set1.size() > set2.size())
            return getIntersection(set2,set1);

        for (Integer n :
                set1) {
            if (set2.contains(n))
                integerSet.add(n);
        }
        int[] arr = new int[integerSet.size()];
        int i = 0;
        for (Integer n :
                integerSet) {
            arr[i++] = n;
        }
        return arr;
    }
}
