
package Concrete;

import Entity.Gamer;
import Abstract.UserCheckManager;

public class EDevletCheckManager extends UserCheckManager{

    @Override
    public boolean CheckIfRealPerson(Gamer gamer, ExampleDatabase exampleDatabase) {
        if (gamer.getFirstName().equals(exampleDatabase.getFirstName()) &&
                gamer.getNationalIdentity().equals(exampleDatabase.getNationalIdentity()) &&
                gamer.getLastName().equals(exampleDatabase.getLastName()) &&
                gamer.getDateOfBirth().getYear() == exampleDatabase.getDateOfBirth().getYear())
        {
            return true;
        } else {
            return false;
        }
    }

}
