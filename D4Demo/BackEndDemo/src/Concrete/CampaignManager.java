
package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

    public void addCampaign(Campaign campaign){
        System.out.println(campaign.getName() + " isimli kampanya eklenmiştir.");
    }
    public void removeCampaign(Campaign campaign){
        System.out.println(campaign.getName() + " isimli kampanya kaldırılmıştır.");
    }
    public void updateCampaign(Campaign campaign){
        System.out.println(campaign.getName() + " isimli kampanya güncellenmiştir.");
    }
}
