
package Abstract;

import Entity.Gamer;
import Concrete.ExampleDatabase;

public abstract class UserCheckManager implements UserCheckService{

    @Override
    public abstract boolean CheckIfRealPerson(Gamer gamer,ExampleDatabase exampleDatabase);

}
