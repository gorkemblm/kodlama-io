import Business.abstracts.AuthService;
import Business.concretes.AuthManager;
import Core.abstracts.AuthorityService;
import Core.concretes.AuthorityDefaultManager;
import Core.concretes.EmailManager;
import Core.concretes.outs.GoogleManager;
import Core.concretes.adapters.GoogleManagerAdapter;
import DataAccess.concretes.DefaultUserDao;
import Entities.concretes.User;
import InMemoryDB.InMemory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //InMemory oluşturma amaçlı yapıldı
        User user_1 = new User(1,"Görkem","Bilim","gorkembilim@test.com","gorkem123");
        User user_2 = new User(2,"Zafer","Çalışkan","zafercaliskan@test.com","zafer123");
        User user_3 = new User(3,"Sadık","Ortaoğlan","sadikortaoglan@test.com","sadik123");

        InMemory inMemory = new InMemory();

        inMemory.users.add(user_1);
        inMemory.users.add(user_2);
        inMemory.users.add(user_3);

        AuthorityService authorityService = new GoogleManagerAdapter(new GoogleManager());//Yetkilendirme içeren
        AuthorityService authorityService2 = new AuthorityDefaultManager();//Yetkilendirme içermeyen

        AuthService authService = new AuthManager(new EmailManager(),new DefaultUserDao(inMemory),authorityService);

        String actions = "1 - SignUp\n" +
                         "2 _ SignIn\n" +
                         "q - Quit";

        System.out.println("Welcome");
        while (true) {
            System.out.println(actions);
            System.out.print("Choose an action : ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("Logging out");
                return;

            }else if (input.equals("1")) {
                System.out.print("Name : ");
                String fisrtname = scanner.nextLine();
                System.out.print("Surname : ");
                String lastName = scanner.nextLine();

                System.out.print("1- Other mails\n" +
                                   "2- with Google Mail\n" +
                        "Choose an action : ");
                String action = scanner.nextLine();

                if (action.equals("1")){
                    System.out.print("Email : ");
                    String email = scanner.nextLine();
                    System.out.print("Password : ");
                    String password = scanner.nextLine();

                    User registerUser = new User(101,fisrtname,lastName,email,password);
                    authService.signUp(registerUser,authorityService2);
                    return;

                }else if(action.equals("2")) {
                    System.out.print("Email : ");
                    String email = scanner.nextLine();
                    System.out.print("Password : ");
                    String password = scanner.nextLine();

                    User registerUser = new User(102,fisrtname,lastName,email,password);
                    authService.signUp(registerUser,authorityService);
                    return;

                }else {
                    System.out.println("Invalid transaction");
                }
            }else if (input.equals("2")){
                System.out.print("Email : ");
                String email = scanner.nextLine();
                System.out.print("Password : ");
                String password = scanner.nextLine();

                User inUser = new User(email,password);
                authService.signIn(inUser);
                return;

            }else {
                System.out.println("Invalid transaction");
            }
        }
    }
}
