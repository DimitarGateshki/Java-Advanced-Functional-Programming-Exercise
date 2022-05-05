package PredicateParty;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        String command = sc.nextLine();
        while (!command.equals("Party!")) {
            String[] token = command.split("\\s+");
            switch (token[0]) {
                case "Remove":
                    input.removeIf(getPredicate(token[1], token[2]));

                    break;
                case "Double":
                    for (int i = 0; i < input.size(); i++) {
                        String guest = input.get(i);
                        if (getPredicate(token[1], token[2]).test(guest)) {
                            input.add(i++, guest);
                        }
                    }
                    break;
            }

            command = sc.nextLine();
        }


        if (input.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            Collections.sort(input);
            System.out.println(String.format("%s are going to the party!", String.join(", ", input)));

        }

    }







    private static Predicate<String> getPredicate(String type, String parameter) {
        switch (type) {
            case "StartsWith":
                return text -> text.startsWith(parameter);
            case "EndsWith":
                return text -> text.endsWith(parameter);
            case "Length":
                return text -> text.length() == Integer.parseInt(parameter);
            default:
                return text -> false;
        }
    }
}
