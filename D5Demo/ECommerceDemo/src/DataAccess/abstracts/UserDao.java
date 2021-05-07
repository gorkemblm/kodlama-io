package DataAccess.abstracts;

import Entities.concretes.User;

public interface UserDao {
    void addToDB(User user);
    User getFromDB(String email);
}
