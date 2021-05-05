
package Abstract;

import Entity.Gamer;
import Concrete.ExampleDatabase;

public interface UserCheckService {

    boolean CheckIfRealPerson(Gamer gamer, ExampleDatabase exampleDatabase);
}
