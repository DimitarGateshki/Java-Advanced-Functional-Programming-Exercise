package FindTheSmallest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());

        Function<List<Integer>,Integer> smallest= list->{
            Integer min= Collections.min(list);
            return  min;
        };

        System.out.println(numbers.lastIndexOf(smallest.apply(numbers)));
    }
}
