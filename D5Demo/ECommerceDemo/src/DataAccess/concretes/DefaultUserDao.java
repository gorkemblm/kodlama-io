package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;
import InMemoryDB.InMemory;

public class DefaultUserDao implements UserDao {
    //Veri tabanı görevi için
    private InMemory inMemory;

    public DefaultUserDao(InMemory inMemory) {
        this.inMemory = inMemory;
    }


    @Override
    public void addToDatabase(User user) {
        inMemory.users.add(user);
    }

    @Override
    public void deleteFromDatabase(User user) {
        User filterUser = inMemory.users.stream()
                .filter(s-> s.getEmail().equals(user.getEmail()))
                .findFirst().orElse(null);
        inMemory.users.remove(filterUser);
    }

    @Override
    public void updateFromDatabase(User user) {
        User filterUser = inMemory.users.stream().filter(s-> s.getEmail().equals(user.getEmail()))
                .findFirst().orElse(null);
        getFromDatabase(user.getEmail()).setId(user.getId());
        getFromDatabase(user.getEmail()).setFirstName(user.getFirstName());
        getFromDatabase(user.getEmail()).setLastName(user.getLastName());
        getFromDatabase(user.getEmail()).setEmail(user.getEmail());
        getFromDatabase(user.getEmail()).setPassword(user.getPassword());
    }

    @Override
    public User getFromDatabase(String email) {
        User filterUser = inMemory.users.stream().filter(s -> s.getEmail().equals(email))
                .findFirst()
                .orElse(null);
        if (filterUser != null) {
            return filterUser;
        } else {
            return null;
        }
    }
}
