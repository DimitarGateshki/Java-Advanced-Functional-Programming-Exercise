package CustomComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> input= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());
        Comparator<Integer> compare=((a, b)->{
            if (a%2==0&&b%2==0){
                return a.compareTo(b);
            }else if (a%2==0&&b%2!=0){
                return -1;
            }else if (a%2!=0&&b%2==0){
                return 1;
            }

            return a.compareTo(b);

        });

        input.stream().sorted(compare).forEach(e-> System.out.print(e+" "));
    }

}
