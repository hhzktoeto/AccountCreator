import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternativeEmail;
    private String email;
    private final String COMPANY_SUFFIX = "secondgoogle.hhz";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.email = String.format("%s.%s@%s.%s", this.firstName.toLowerCase(), this.lastName.toLowerCase(),
                                   this.department, COMPANY_SUFFIX);
        this.password = createPassword();

    }

    private String setDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Utils.chooseDepMessage);
        while (true) {
            int depChoise = scanner.nextInt();
            switch (depChoise) {
                case 1:
                    return "finance";
                case 2:
                    return "security";
                case 3:
                    return "hr";
                case 4:
                    return "developing";
                case 5:
                    return "marketing";
                case 6:
                    return "god";
                case 7:
                    return "logistics";
                case 8:
                    return "production";
                default:
                    System.out.println("PLEASE, CHOOSE A VALID OPTION FROM 1 TO 6");
            }
        }
    }

    private String createPassword() {
        Random random = new Random();
        char[] charArray = new char[12];
        for (int i = 0; i < 12; i++) {
            charArray[i] = Utils.letters.charAt(random.nextInt(64));
        }
        return String.valueOf(charArray);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getEmail () {
        return this.email;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    String getPassword() {
        return password;
    }

    public void printInfo() {
        System.out.printf("""
                NAME: %s
                SURNAME: %s
                E-MAIL: %s
                PASSWORD: %s
                MAILBOX CAPACITY: %d MB
                """, this.firstName, this.lastName, this.email, this.password, this.mailboxCapacity);
    }
}
