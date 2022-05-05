package AppliedArithmetics;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[],int[]> add= arr->Arrays.stream(arr).map(e->e+=1).toArray();
        Function<int[],int[]>multy=arr->Arrays.stream(arr).map(e->e*=2).toArray();
        Function<int[],int[]>sub=arr->Arrays.stream(arr).map(e->e-=1).toArray();
        Consumer<int[]> print= arr->Arrays.stream(arr).forEach(e-> System.out.printf("%s ",e));

        String line= scanner.nextLine();

        while (!line.equals("end")){
            switch (line){
                case "add":
                    numbers=add.apply(numbers);
                    break;
                case "multiply":
                    numbers= multy.apply(numbers);
                    break;
                case "subtract":
                    numbers=sub.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }
            line=scanner.nextLine();
        }
    }
}
