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
    public void addToDB(User user) {
        inMemory.users.add(user);
    }

    @Override
    public User getFromDB(String email) {//Email e göre getirme (isterlere göre)
        User filterUser = inMemory.users.stream().filter(s-> s.getEmail().equals(email))
                .findFirst()
                .orElse(null);
        if (filterUser != null) {
            return filterUser;
        }else {
            return null;
        }
    }



}
