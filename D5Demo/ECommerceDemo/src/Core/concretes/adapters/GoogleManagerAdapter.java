package Core.concretes.adapters;

import Core.abstracts.AuthorityService;
import Core.concretes.outs.GoogleManager;

public class GoogleManagerAdapter implements AuthorityService {
    private GoogleManager googleManager;

    public GoogleManagerAdapter(GoogleManager googleManager){
        this.googleManager = googleManager;
    }
    @Override
    public boolean authorize() {
        return googleManager.authorize();
    }
}
