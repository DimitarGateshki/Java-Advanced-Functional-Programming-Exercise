package ListOfPredicates;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Integer> input= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());
        BiFunction<List<Integer>,Integer,Boolean> isValid=((list, number)->{
            for (Integer el:list) {
                if (number%el!=0){
                    return false;
                }
            }
            return true;
        });



        for (int i = 1; i <= n; i++) {
            if (isValid.apply(input,i)){
                System.out.print(i+" ");
            }


        }
    }
}
