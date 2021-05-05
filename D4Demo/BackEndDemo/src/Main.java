

import Abstract.UserCheckManager;
import Concrete.CampaignManager;
import Concrete.EDevletCheckManager;
import Concrete.ExampleDatabase;
import Concrete.GamerManager;
import Concrete.SaleGameManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        //Veritabanı gibi kontrol etmeyi sağlamak adına yapılmıştır
        ExampleDatabase exampleDatabaseTrue = new ExampleDatabase("Görkem","Bilim","44872530890",LocalDate.of(1998,4,15));
        ExampleDatabase exampleDatabaseFalse = new ExampleDatabase("Deneme","Deneme","11111111111",LocalDate.of(1990,5,25));

        //Yeni oyuncu
        Gamer gamer = new Gamer(1,"gorkemblm@gmail.com","q1w2e3r4","Scourge","Görkem","Bilim","44872530890",LocalDate.of(1998,4,15));

        //Yeni Kampanya
        Campaign campaign1 = new Campaign();
        campaign1.setId(1);
        campaign1.setName("Yılbaşı");
        campaign1.setDescription("25 - 31 aralık tarihleri arasında geçerli bir kampanya");
        campaign1.setDiscountRate(30);

        //Yeni Oyun
        Game game = new Game(1,"Valheim",32);

        //Edevlet kontrolü için oluşturulmuştur
        UserCheckManager eDevlet = new EDevletCheckManager();

        //Kayıt-kontrol işlemi için
        GamerManager falseCheck = new GamerManager(eDevlet, exampleDatabaseFalse);
        GamerManager trueCheck = new GamerManager(eDevlet, exampleDatabaseTrue);

        //Doğru bilgi - Yanlış bilgi
        falseCheck.signUp(gamer);
        trueCheck.signUp(gamer);

        //Kayıt silme ve güncelleme
        GamerManager gamerManager = new GamerManager();
        gamerManager.updateInformation(gamer);
        gamerManager.removeRecord(gamer);


        //Satış yönetimi için -- Kampanyalı ve kampanyasız
        SaleGameManager saleGameManager = new SaleGameManager();
        saleGameManager.buy(gamer, game);
        saleGameManager.buy(gamer, campaign1, game);

        //Kampanya yönetimi için
        CampaignManager campaignManager = new CampaignManager();

        campaignManager.addCampaign(campaign1);
        campaignManager.removeCampaign(campaign1);
        campaignManager.updateCampaign(campaign1);


    }
}
