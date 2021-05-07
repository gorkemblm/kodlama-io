package Core.concretes.adapters;

import Core.abstracts.AuthorityService;
import Core.concretes.AuthorityGoogleManager;

public class AuthorityGoogleManagerAdapter implements AuthorityService {
    private AuthorityGoogleManager authorityGoogleManager;

    public AuthorityGoogleManagerAdapter(AuthorityGoogleManager authorityGoogleManager){
        this.authorityGoogleManager = authorityGoogleManager;
    }
    @Override
    public boolean authorize() {
        return true;
    }
}