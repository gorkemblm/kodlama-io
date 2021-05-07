package DataAccess.abstracts;

import Entities.concretes.User;

public interface UserDao {
    void addToDatabase(User user);
    void deleteFromDatabase(User user);
    void updateFromDatabase(User user);
    User getFromDatabase(String email);
}
