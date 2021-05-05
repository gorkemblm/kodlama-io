
package Concrete;

import Abstract.UserCheckService;
import Abstract.UserManager;
import Entity.Gamer;


public class GamerManager extends UserManager {

    UserCheckService checkService;
    ExampleDatabase exampleDatabase;

    public GamerManager(){

    }

    public GamerManager(UserCheckService checkService, ExampleDatabase exampleDatabase) {
        this.checkService = checkService;
        this.exampleDatabase = exampleDatabase;
    }



    @Override
    public void removeRecord(Gamer gamer) {
        System.out.println(gamer.getUserName() + " isimli oyuncu sistemden silindi");
    }

    @Override
    public void updateInformation(Gamer gamer) {
        System.out.println(gamer.getUserName() + " isimli oyuncu bilgilerini  güncelledi");

    }

    @Override
    public void signUp(Gamer gamer) {
        if (checkService.CheckIfRealPerson(gamer, exampleDatabase)) {
            System.out.println("Başarıyla kayıt oldunuz.");
        }else {
            System.out.println("girdiğiniz bilgiler yanlış!");
        }
    }



}
