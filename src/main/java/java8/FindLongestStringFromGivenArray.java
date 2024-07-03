package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLongestStringFromGivenArray
{
    public static void main(String[] args) {
        String []arr={"alok","gautam","sahil","chandrashekhar"};
        Optional<String> longestString = Arrays.stream(arr)
                .max(Comparator.comparingInt(String::length));
        System.out.println("The longest string is: " + longestString.get());

    }
}
