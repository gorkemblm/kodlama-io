
package Abstract;

import Entity.Gamer;

public interface UserService {

    void signUp(Gamer gamer);
    void updateInformation(Gamer gamer);
    void removeRecord(Gamer gamer);

}
