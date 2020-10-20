import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        Integer [] numbers=new Integer[10];

        Random rn=new Random();

        for (int i=0; i<numbers.length;i++){
            numbers[i]=rn.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        Stream<Integer> numberStream=Arrays.stream(numbers);
        List<Integer> evenNumbers = numberStream.filter(number -> number % 2 == 0).collect(Collectors.toList());

        System.out.println(evenNumbers.toString());

        Stream<Integer> evenStream = evenNumbers.stream();
        evenStream.map(even -> even + "even").forEach(str -> System.out.println(str));

        Stream<Integer> numberStream2 = Arrays.stream(numbers);
        numberStream2.sorted().forEach(number -> System.out.print(number + " "));
        System.out.println();
        Stream<Integer> evenStream2 = evenNumbers.stream();
        evenStream2.sorted(Comparator.reverseOrder()).forEach(even -> System.out.print(even + ", "));

    }

}
