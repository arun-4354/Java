package nrec;


import java.util.*;

public class No6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the student's name:");
            String name = scanner.nextLine();

            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Student name cannot be null");
            }

            System.out.print("Enter the student's score:");
            String scoreInput = scanner.nextLine();

            int score = Integer.parseInt(scoreInput);

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be between 0 and 100");
            }

            System.out.println("The score has been successfully recorded");

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("The score is not a valid integer");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            scanner.close();
        }
    }
}