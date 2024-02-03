import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private DataBase() {
    }
    private static Map<Integer, Email> employeesDataBase = new HashMap<>();
    private static Map<String, String> passwordsDataBase = new HashMap<>();

    public static void addEmployee(int id, Email account) {
        employeesDataBase.put(id, account);
    }
    public static void addLoginInfo(String email, String password) {
        passwordsDataBase.put(email, password);
    }

}
