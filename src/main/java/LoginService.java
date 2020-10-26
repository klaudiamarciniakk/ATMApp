import java.util.Scanner;

public class LoginService {
    private static AccountManager accountManager;

    public static void main(String[] args) {
        accountManager = new AccountManager();
        menu();
    }

    public static void menu() {
        System.out.println("Hello in ATM");
        System.out.println("Pick one");
        System.out.println("1. Sign in");
        System.out.println("2. Sign up");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        if (!x.equals("1") && !x.equals("2")) {
            System.out.println("Pick correct");
            menu();

        } else if (x.equals("1")) {
            login();

        } else {
            createAccount();
        }
    }


    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new login");
        String login = scanner.nextLine();
        System.out.println("Enter password");
        String pass = scanner.nextLine();
        if (!accountManager.checkLoginAvailability(login)) {
            System.out.println("Login is used");
            System.out.println("Do you want to continue? Y/N");
            String agree = scanner.nextLine();
            if (agree.equals("Y") || agree.equals("y")) {
                createAccount();
            } else if (agree.equals("N") || agree.equals("n")) {
                menu();
            } else {
                System.out.println("Unrecognized. Back to menu");
                menu();
            }

        } else {
            accountManager.add(new Account(login, pass));
            System.out.println("Added new account");
            menu();
        }
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println("Enter password");
        String pass = scanner.nextLine();
        if (!accountManager.checkLogin(login)) {
            System.out.println("Wrong login");
            login();
        } else {
            if (!accountManager.checkPass(login, pass)) {
                System.out.println("Wrong password");
                login();
            } else {
                System.out.println("Login correct!");
                ATMService.menu(accountManager, login);
            }
        }
    }
}




