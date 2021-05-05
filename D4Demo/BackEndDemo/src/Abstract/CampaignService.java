package Abstract;

import Entity.Campaign;

public interface CampaignService {

    void addCampaign(Campaign campaign);
    void removeCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
}
