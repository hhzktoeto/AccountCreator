import java.util.Scanner;

public class AccountCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NAME");
        String firstName = scanner.nextLine();
        System.out.println("ENTER THE SURNAME");
        String lastName = scanner.nextLine();

        Email test = new Email(firstName, lastName);
        test.printInfo();
        DataBase.addEmployee(1, test);
        DataBase.addLoginInfo(test.getEmail(), test.getPassword());
    }
}