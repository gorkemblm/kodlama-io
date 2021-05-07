package Business.concretes;

import Business.abstracts.AuthService;
import Core.abstracts.AuthorityService;
import Core.abstracts.EmailService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class AuthManager implements AuthService {
    private EmailService emailService;
    private UserDao userDao;
    private AuthorityService authorityService;

    public AuthManager(EmailService emailService, UserDao userDao,AuthorityService authorityService) {
        this.emailService = emailService;
        this.userDao = userDao;
        this.authorityService = authorityService;
    }

    @Override
    public void signIn(User user) {
        if (userDao.getFromDatabase(user.getEmail()).getEmail().equals(user.getEmail()) && userDao.getFromDatabase(user.getEmail()).getPassword().equals(user.getPassword())) {
            System.out.println("You have successfully logged in");
        }else {
            System.out.println("Try Again");
        }
    }

    @Override
    public void signUp(User user, AuthorityService authorityService) {
        if (!authorityService.authorize()) {//Yetkilendirme yoksa
            if (userDao.getFromDatabase(user.getEmail()) == null) {
                if (user.getFirstName().length() > 1
                        && user.getLastName().length() > 1
                        && emailService.validateEmail(user.getEmail())
                        && user.getPassword().length() > 5) {
                    emailService.sendToVerifyMail();
                    if (emailService.isTheLinkClicked()) {
                        userDao.addToDatabase(user);
                        System.out.println("Registration completed successfully");
                    }
                } else {
                    System.out.println("Your registration could not be completed");
                }
            }else {
                System.out.println("You already have an account");
            }
        }else if(authorityService.authorize()){//Yetkilendirme varsa
            if (user.getFirstName().length() > 1
                    && user.getLastName().length() > 1){//Google - mail ve parola oluşumunu kendisi kontrol ettiği için burada kontrol sağlamadım.
                emailService.sendToVerifyMail();
                if (emailService.isTheLinkClicked()) {
                    userDao.addToDatabase(user);
                    System.out.println("Registration completed successfully");
                }
            }else {
                System.out.println("Your registration could not be completed");
            }
        }
    }
}
