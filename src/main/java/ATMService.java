/*
import java.util.Scanner;

public class ATMService {
    public static void menu(AccountManager accountManager, String login) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what do you want to do " + login + " ?");
        System.out.println("1. Add cash");
        System.out.println("2. Check your balance");
        System.out.println("3. Get some cash");
        System.out.println("4. Log out");
        String x = scanner.nextLine();
        if (x.equals("1")) {
            System.out.println("How many?");
            int cash = Integer.parseInt(scanner.nextLine());
            accountManager.list.get(accountManager.search(login)).wallet.setCash(accountManager.list.get(accountManager.search(login)).wallet.getCash() + cash);
            System.out.println("Added! You now have : " + accountManager.list.get(accountManager.search(login)).wallet.getCash());
            menu(accountManager, login);
        } else if (x.equals("2")) {
            System.out.println("Your balance is : " + accountManager.list.get(accountManager.search(login)).wallet.getCash());
            menu(accountManager, login);
        } else if (x.equals("3")) {
            System.out.println("How many?");
            int cash = Integer.parseInt(scanner.nextLine());
            if (cash > accountManager.list.get(accountManager.search(login)).wallet.getCash()) {
                System.out.println("You dont have enough cash");
                menu(accountManager, login);
            } else {
                //accountManager.list.get(accountManager.search(login)).wallet.setCash(accountManager.list.get(accountManager.search(login)).wallet.getCash() - cash);
                System.out.println("Now you have your cash in hands!");
                menu(accountManager, login);
            }
        } else if (x.equals("4")) {
            System.out.println("Thanks for using ours ATM's");
            LoginService.menu();
        }
    }

}
*/
