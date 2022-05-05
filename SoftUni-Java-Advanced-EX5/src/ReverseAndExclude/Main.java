package ReverseAndExclude;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());
        int n=Integer.parseInt(scanner.nextLine());

        Predicate<Integer> divides= numb->numb%n==0;

        numbers.removeIf(divides);

        Collections.reverse(numbers);

        numbers.forEach(integer -> System.out.printf("%d ",integer));
    }
}
