
package Abstract;

import Entity.Gamer;

public abstract class UserManager implements UserService{


    @Override
    public abstract void signUp(Gamer gamer);

    @Override
    public abstract void updateInformation(Gamer gamer);

    @Override
    public abstract void removeRecord(Gamer gamer);

}
