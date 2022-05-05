package PredicateForNames;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=Integer.parseInt(sc.nextLine());

        List<String> names= Arrays.asList(sc.nextLine().split("\\s+").clone());

        Predicate<String> check= n -> n.length()<=length;

        names.stream().filter(check).forEach(e-> System.out.println(e));
    }
}
