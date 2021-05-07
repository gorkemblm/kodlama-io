package Business.concretes;

import Business.abstracts.UserService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService {
    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.addToDatabase(user);
        System.out.println(user.getEmail() + " ile veritabanına eklendi");
    }

    @Override
    public void delete(User user) {
        userDao.deleteFromDatabase(user);
        System.out.println(user.getId() + " id li user silindi");
    }

    @Override
    public void update(User user) {
        userDao.updateFromDatabase(user);
        System.out.println("User güncellendi");
    }

    @Override
    public void get(String email) {
        User inUser = userDao.getFromDatabase(email);
        System.out.println(inUser.getFirstName() + inUser.getLastName() + " isimli kullanıcı");
    }

}
