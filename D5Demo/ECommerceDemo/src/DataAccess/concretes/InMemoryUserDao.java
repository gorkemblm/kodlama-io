package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;
import InMemoryDB.InMemory;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {

    public static List<User> users = new ArrayList<User>();

    public InMemoryUserDao() {
        //InMemory oluşturma amaçlı yapıldı
        User user_1 = new User(1,"Görkem","Bilim","gorkembilim@test.com","gorkem123");
        User user_2 = new User(2,"Zafer","Çalışkan","zafercaliskan@test.com","zafer123");
        User user_3 = new User(3,"Sadık","Ortaoğlan","sadikortaoglan@test.com","sadik123");

        InMemoryUserDao.users.add(user_1);
        InMemoryUserDao.users.add(user_2);
        InMemoryUserDao.users.add(user_3);
    }


    @Override
    public void addToDatabase(User user) {
        InMemoryUserDao.users.add(user);
    }

    @Override
    public void deleteFromDatabase(User user) {
        User filterUser = InMemoryUserDao.users.stream()
                .filter(s-> s.getEmail().equals(user.getEmail()))
                .findFirst().orElse(null);
        InMemoryUserDao.users.remove(filterUser);
    }

    @Override
    public void updateFromDatabase(User user) {
        User filterUser = InMemoryUserDao.users.stream().filter(s-> s.getEmail().equals(user.getEmail()))
                .findFirst().orElse(null);
        getFromDatabase(user.getEmail()).setId(user.getId());
        getFromDatabase(user.getEmail()).setFirstName(user.getFirstName());
        getFromDatabase(user.getEmail()).setLastName(user.getLastName());
        getFromDatabase(user.getEmail()).setEmail(user.getEmail());
        getFromDatabase(user.getEmail()).setPassword(user.getPassword());
    }

    @Override
    public User getFromDatabase(String email) {
        User filterUser = InMemoryUserDao.users.stream().filter(s -> s.getEmail().equals(email))
                .findFirst()
                .orElse(null);
        if (filterUser != null) {
            return filterUser;
        } else {
            return null;
        }
    }
}
