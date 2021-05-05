
package Concrete;

import Abstract.SaleManager;
import Entity.Gamer;
import Entity.Campaign;
import Entity.Game;

public class SaleGameManager extends SaleManager{

    @Override
    public void buy(Gamer gamer, Campaign campaign, Game game) {
        System.out.println(gamer.getFirstName() + " isimli kullanıcı " + game.getName() + " isimli oyunu " + (game.getUnitPrice()-(game.getUnitPrice()*campaign.getDiscountRate())/100) + " fiyatıyla satın aldı");
    }

    @Override
    public void buy(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " isimli kullanıcı " + game.getName() + " isimli oyunu satın aldı");
    }

}
