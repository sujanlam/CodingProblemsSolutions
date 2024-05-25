package java8streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Using Java 8 Streams to find min and max
public class FindSecondlargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,5,7,19,0,1,211);

        int secondlargest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondlargest);
    }

}
