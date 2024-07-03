package java8;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingElementInString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String word=sc.next();
        Optional<Map.Entry<Character, Long>> ch=word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().filter(s->s.getValue()==1).findFirst();
        if(!ch.isEmpty())
        {
            System.out.println(ch);
        }
        else {
            System.out.println("not found ie all elements have duplicate value");
        }

    }
}
