package Business.concretes;

import Core.abstracts.AuthorityService;
import Core.abstracts.EmailService;
import Business.abstracts.UserService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService {
    private EmailService emailService;
    private UserDao userDao;
    private AuthorityService authorityService;

    public UserManager(EmailService emailService, UserDao userDao,AuthorityService authorityService) {
        this.emailService = emailService;
        this.userDao = userDao;
        this.authorityService = authorityService;
    }

    @Override
    public void signIn(User user) {
        if (userDao.getFromDB(user.getEmail()).getEmail().equals(user.getEmail()) && userDao.getFromDB(user.getEmail()).getPassword().equals(user.getPassword())) {
            System.out.println("You have successfully logged in");
        }else {
            System.out.println("Try Again");
        }
    }

    @Override
    public void signUp(User user,AuthorityService authorityService) {
        if (!authorityService.authorize()) {//Yetkilendirme yoksa
            if (userDao.getFromDB(user.getEmail()) == null) {
                if (user.getFirstName().length() > 1
                        && user.getLastName().length() > 1
                        && emailService.validateEmail(user.getEmail())
                        && user.getPassword().length() > 5) {
                    emailService.sendToVerifyMail();
                    if (emailService.isTheLinkClicked()) {
                        userDao.addToDB(user);
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
                    userDao.addToDB(user);
                    System.out.println("Registration completed successfully");
                }
            }else {
                System.out.println("Your registration could not be completed");
            }
        }
    }
}
