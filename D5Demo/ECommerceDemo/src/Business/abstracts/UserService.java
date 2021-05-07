package Business.abstracts;

import Core.abstracts.AuthorityService;
import Entities.concretes.User;

public interface UserService {
    void signIn(User user);
    void signUp(User user, AuthorityService authorityService);
}
