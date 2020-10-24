import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    List<Account> list = new ArrayList();

    public void add(Account account) {
        list.add(account);
    }

    public int search(String login) {
        int count = 0;
        for (Account account : list) {
            if (!account.login.equals(login)) {
                count++;
            }
        }
        return count;
    }

    public boolean checkLogin(String login) {
        for (Account account : list) {
            if (account.login.equals(login)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkLoginAvailability(String login) {
        for (Account account : list) {
            if (account.login.equals(login)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPass(String login, String pass) {
        if (list.get(search(login)).pass.equals(pass)) {
            return true;
        }
        return false;
    }
}

