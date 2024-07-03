package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class secondMinInArray
{
    public static void main(String[] args)
    {
        int arr[]={1,4,7,2,9,5};

        OptionalInt first = Arrays.stream(arr).boxed()
                .sorted()
                .mapToInt(Integer::intValue)
                .skip(1)
                .findFirst();
        System.out.println(first);
        Arrays.stream(arr).sorted().skip(1).limit(1).forEach(System.out::println);

    }
}
