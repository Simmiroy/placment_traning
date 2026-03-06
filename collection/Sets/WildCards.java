package collection.Sets;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void printList(List<?> list) {        //? is a generic data type , it can handle anything.
        for(Object o:list){
            System.out.print(o+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String>Str=new ArrayList<>();
        Str.add("DSA");
        Str.add("CPP");
        Str.add("HELLO");
        Str.add("JAVA");
        printList(Str);
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(5);
        integers.add(3);
        printList(integers);
    }
}
