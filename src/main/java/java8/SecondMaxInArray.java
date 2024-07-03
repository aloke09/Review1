package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondMaxInArray
{
    public static void main(String[] args)
    {
        int arr[]={1,4,7,2,9,5};
        int len= arr.length;
        Arrays.stream(arr).sorted().skip(len-2).limit(1).forEach(System.out::println);

    }
}
