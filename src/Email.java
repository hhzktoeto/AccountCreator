import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternativeEmail;
    private String email;
    private int defaultPasswordLength = 10;
    private String companySuffix = "secondgoogle.hhz";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("E-MAIL FOR " + this.firstName + " " + this.lastName + " CREATED");

        this.department = setDepartment();

        //TODO String.format
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department +
                companySuffix;
        System.out.println("YOUR E-MAIL: " + this.email);

        this.password = createPassword(defaultPasswordLength);
        System.out.println("SAVE YOUR PASSWORD: " + this.password);

    }

    private String setDepartment() {
        //TODO убрать NONE, придумать парочку
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                CHOOSE NEW EMPLOYEE'S DEPARTMENT
                1. FINANCE
                2. SECURITY
                3. HR
                4. DEVELOPING
                5. MARKETING
                6. NONE""");
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
                    return "";
                default:
                    System.out.println("PLEASE, CHOOSE A VALID OPTION FROM 1 TO 6");
            }
        }
    }

    // TODO переделать createPassword метод
    private String createPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return String.valueOf(password);
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

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    String getPassword() {
        return password;
    }

    public void printInfo(){
        //TODO String.format()
        System.out.println("""
                NAME: 
                SURNAME: 
                MAILBOX CAPACITY: """);
    }
}
