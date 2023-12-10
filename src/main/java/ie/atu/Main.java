package ie.atu;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        try {
            System.out.println("Enter 10 integers, one at a time:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter integer #" + (i + 1) + ": ");
                int input = scanner.nextInt();
                integerList.add(input);
            }

            System.out.println("Entered integers: " + integerList);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }

    }
}