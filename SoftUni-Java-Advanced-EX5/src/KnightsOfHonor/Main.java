package KnightsOfHonor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<String> names= Arrays.asList(sc.nextLine().split("\\s+").clone());

        Consumer<String> print= e-> System.out.printf("Sir %s%n",e);

        names.forEach(e->print.accept(e));
    }
}
