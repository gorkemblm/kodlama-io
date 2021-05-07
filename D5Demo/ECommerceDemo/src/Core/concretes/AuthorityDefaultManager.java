package Core.concretes;

import Core.abstracts.AuthorityService;

public class AuthorityDefaultManager implements AuthorityService {
    @Override
    public boolean authorize() {
        return false;
    }
}
