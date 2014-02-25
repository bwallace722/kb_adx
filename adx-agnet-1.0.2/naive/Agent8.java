package naive;

import java.util.HashMap;
import java.util.Random;

import naive.ReasonableBot.CampaignData;
import tau.tac.adx.props.AdxBidBundle;


public class Agent8 extends ReasonableBot {

	@Override
	protected void simulationSetup() {
		agentName = "8";
		qualityRatingProtection = true;
		randomGenerator = new Random();
		persistantCampaignBid = .1 + 0.01 * randomGenerator.nextDouble();
		day = 0;
		bidBundle = new AdxBidBundle();
		ucsTargetLevel = 1;

		myCampaigns = new HashMap<Integer, CampaignData>();
		//	log.fine("AdNet " + getName() + " simulationSetup");
	}
}
