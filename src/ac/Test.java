package ac;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {



    public static void main(String[] args) {

       // List<Integer> list = List.of(0, 0, 2, 0, 3, 7, 2, 0);

        int[] list = {0, 0, 2, 0, 3, 7, 2, 0};
        System.out.println("Numbers in an Arrays : "
                + Arrays.toString(list));

       // Object[] numbers = list.toArray();
        // IntStream stream = Arrays.stream(int[] arr);
        // int arr2[]=  {-1,-3,-8,,5,1,6}
       // List<Integer>  list2= list.stream().filter(i -> i != 0).collect(Collectors.toList());
        int secondLargestNumber= Arrays.stream(list).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(secondLargestNumber);
     //   int[] array = new int[list.size()];
     // System.out.println(Arrays.toString(list2.toArray(array)));


    }
    }

