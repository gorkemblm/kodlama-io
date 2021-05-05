
package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public interface SaleService {

    public void buy(Gamer gamer, Game game );
    public void buy(Gamer gamer, Campaign campaign, Game game);
}
