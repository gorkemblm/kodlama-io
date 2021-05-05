
package Abstract;

import Entity.Gamer;
import Entity.Campaign;
import Entity.Game;

public abstract class SaleManager implements SaleService{

    @Override
    public void buy(Gamer gamer, Game game ){
        System.out.println("Kampanyasız satış gerçekleştirildi");
    }

    @Override
    public void buy(Gamer gamer, Campaign campaign, Game game ){
        System.out.println("Kampanyalı satış gerçekleştirildi.");
    }

}
