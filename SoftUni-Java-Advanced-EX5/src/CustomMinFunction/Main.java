package CustomMinFunction;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] numbers= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        Function<int[],Integer> min= arr->Arrays.stream(arr).min().getAsInt();

        System.out.println(min.apply(numbers));
    }
}


