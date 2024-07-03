package java8;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class FindNonDuplicateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String word=sc.next();
        word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().filter(s->s.getValue()==1).forEach(System.out::println);

    }
}
