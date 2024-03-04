package extand;

import java.util.Scanner;

/**
 * AIT-TR, cohort 42.1, Java Basic, hw #10
 * @author Alexandru Postica
 * @ version 8,23,26,28-Feb
 */
public class    Interpreter {
    public static void main(String[] args) {
        Variables variables = new Variables();
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "print":
                    Integer value = variables.getValue(tokens[1]);
                    if (value != null) {
                        System.out.println(value);
                    }
                    break;
                case "exit":
                    System.out.println("Exit from interpreter.");
                    break;
                default:
                    // to interpreter line like: a = 123
                    tokens = line.split("=");
                    // if right side from '=' is not empty
                    if (tokens.length == 1) {
                        System.out.println("Error: invalid command");
                        break;
                    }
                    variables.setValues(tokens[0].trim(), tokens[1].trim());
            }
        } while (!line.equals("exit"));
    }
}
