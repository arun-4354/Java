package nrec;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class User {
    private int age;

    public User(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else if (age > 100) {
            throw new InvalidAgeException("Age cannot be greater than 100.");
        }
        this.age = age;
        System.out.println("Valid age.");
    }
}

public class No7{
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Please provide the age.");
            }

            int age = Integer.parseInt(args[0]);
            User user = new User(age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Age must be a number.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
