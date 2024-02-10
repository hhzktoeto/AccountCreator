import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataBase {

    private DataBase() {
    }

    private static Map<Integer, Email> employeesDataBase = new HashMap<>();
    private static Map<String, String> passwordsDataBase = new HashMap<>();

    public static void addEmployee(int id, Email account) {
        if (!(employeesDataBase.containsKey(id))) {
            employeesDataBase.put(id, account);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("EMPLOYEE %d:%s IS ALREADY REGISTERED. DO YOU WANT TO REWRITE AN INFO? (y/n)",
                    id, account.getEmail());
            boolean isValidResponse = false;
            while (!isValidResponse) {
                String response = scanner.nextLine();
                switch (response) {
                    case "Y", "y":
                        employeesDataBase.put(id, account);
                        isValidResponse = true;
                        break;
                    case "N", "n":
                        isValidResponse = true;
                        break;
                    default:
                        System.out.println("ENTER y FOR YES, n FOR NO");
                }
            }
        }
    }

    public static void addLoginInfo(String email, String password) {
        if (!(passwordsDataBase.containsKey(email))) {
            passwordsDataBase.put(email, password);
        }
    }

}
