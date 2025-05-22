package nrec;



import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the student's name: ");
            String name = scanner.nextLine();

            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Name cannot be null.");
            }

            System.out.print("Enter the student's score: ");
            String scoreInput = scanner.nextLine();

            int score = Integer.parseInt(scoreInput);

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Score must be between 0 and 100.");
            }

            System.out.println("The score has been successfully recorded.");

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: The score is not a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
