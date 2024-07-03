package java8;

import java.util.Arrays;

public class SkipLimit {
    public static void main(String[] args) {
        int arr[]={1,4,7,2,9,5};
        Arrays.stream(arr).skip(1).limit(4).forEach(System.out::println);
    }
}
