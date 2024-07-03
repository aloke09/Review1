package java8;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicateInString
{
    public static void main(String[] args)
    {
        //TO Find all duplicate element from a given string
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String word=sc.next();
        word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(s->s.getValue()>1).forEach(System.out::println);
//        Iterator<Map.Entry<Character, Long>> iterator = charCount.entrySet().iterator();
//        while(iterator.hasNext())
//        {
//            int x= Math.toIntExact(iterator.next().getValue());
//            System.out.println(x);
//            if(x>1)
//            {
//                System.out.println(iterator.next().getValue()+"--->"+iterator.next().getValue());
//            }
//        }
//        charCount.entrySet().stream().filter(s->s.getValue()>1).forEach(System.out::println);



    }
}
