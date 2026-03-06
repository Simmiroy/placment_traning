package collection.Sets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr= {1,1,2,2,3,3,4,5,5,6,6,7,8};
        System.out.println(Arrays.toString(arr));
        Set<Integer> uniqueElements= new HashSet<>();
        for(int x: arr){
            uniqueElements.add(x);
        }
        System.out.println(uniqueElements);
        Set<Integer> nonDup=new HashSet<>();
        nonDup.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3));
        System.out.println(nonDup);
    }
}
