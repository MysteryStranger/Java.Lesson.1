import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        String emailAddress;
        int age;

        System.out.println("Youre name Now!");
        firstName = input.next();

        System.out.println("Youre lastName Now!");
        lastName = input.next();

        System.out.println("Youre emailAddress Now!");
        emailAddress = input.next();

        System.out.println("Youre age Now!");
        age = input.nextInt();

        System.out.print("Hi" + " " + firstName + " " + lastName + " " + "This is your emael dont you? " + emailAddress + " " + "are youre age is" + " " + age + " " + "arent you?" );
    }
}